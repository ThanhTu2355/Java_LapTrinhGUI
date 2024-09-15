
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 */

public class ComboBox extends JFrame {

    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txtSo1, txtSo2, txtKq;
    private JButton btnTinh;
    private JComboBox<String> cbPhepTinh;

    public static void main(String[] args) {
        ComboBox cb = new ComboBox();
        cb.setVisible(true);
    }

    public ComboBox() {
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
        txtSo1.setPreferredSize(new Dimension(100, 30));
        p1.add(lb2 = new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());

        String[] phepTinh = {"+", "-", "x", "/"};
        cbPhepTinh = new JComboBox(phepTinh);
        p1.add(lb3 = new JLabel("Phep tinh"));
        p1.add(cbPhepTinh);

        p1.add(lb4 = new JLabel("Ket qua"));
        p1.add(txtKq = new JTextField());

        add(p1);
        add(btnTinh = new JButton("Tinh"), BorderLayout.SOUTH);

        btnTinh.addActionListener((ActionEvent e) -> {
            try {
                double x1 = Double.parseDouble(txtSo1.getText());
                double y1 = Double.parseDouble(txtSo2.getText());
                double kq = 0;

                String phepTinh1 = (String) cbPhepTinh.getSelectedItem();
                switch (phepTinh1) {
                    case "+":
                        kq = x1 + y1;
                        break;
                    case "-":
                        kq = x1 - y1;
                        break;
                    case "x":
                        kq = x1 * y1;
                        break;
                    case "/":
                        if (y1 != 0) {
                            kq = x1 / y1;
                        } else {
                            JOptionPane.showMessageDialog(null, "Khong the chia cho 0", "Loi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                    default:
                        break;
                }
                txtKq.setText(String.valueOf(kq));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Loi nhap lieu", "Thong bao loi", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
