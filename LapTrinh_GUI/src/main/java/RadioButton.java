
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 */


public class RadioButton extends JFrame{
    
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txtSo1, txtSo2, txtKq;
    private JButton btnTinh;
    private JRadioButton rdCong, rdTru, rdNhan, rdChia;
    
    public static void main(String[] args) {
        RadioButton rd = new RadioButton();
        rd.setVisible(true);
    }
    
    public RadioButton() {
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2, 5, 5));
        p1.add(lb1 = new JLabel("So 1"));
        p1.add(txtSo1 = new JTextField());
        txtSo1.setPreferredSize(new Dimension(100,30));
        p1.add(lb2 = new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(rdCong=new JRadioButton("+"));
        p2.add(rdTru=new JRadioButton("-"));
        p2.add(rdNhan=new JRadioButton("x"));
        p2.add(rdChia=new JRadioButton("/"));
        
        p1.add(lb3= new JLabel("Phep tinh"));
        p1.add(p2);
        p1.add(lb4 = new JLabel("Ket qua"));
        p1.add(txtKq = new JTextField());
        add(p1);
        add(btnTinh= new JButton("Tinh"),BorderLayout.SOUTH);
        
        ButtonGroup btPhepTinh = new ButtonGroup();
        btPhepTinh.add(rdCong);
        btPhepTinh.add(rdTru);
        btPhepTinh.add(rdNhan);
        btPhepTinh.add(rdChia);
        
        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x = Double.parseDouble(txtSo1.getText());
                    double y = Double.parseDouble(txtSo2.getText());
                    double kq;
                    if(rdCong.isSelected()){
                        kq=x+y;
                    }else if(rdTru.isSelected()){
                        kq=x-y;
                    }else if(rdNhan.isSelected()){
                        kq=x*y;
                    }else{
                        kq=x/y;
                    }
                    txtKq.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Loi nhap lieu", "Thong bao loi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
