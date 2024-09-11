
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 */
public class LoginFrame extends JFrame {

    private JLabel lblUser, lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin, btnReset;

    public LoginFrame(String title) {
        super(title);
        taoGiaoDien();
        processEvent();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(lblUser = new JLabel("User name"));
        p.add(txtUser = new JTextField(10));
        p.add(lblPass = new JLabel("Pasword"));
        p.add(txtPass = new JPasswordField(10));
        p.add(btnLogin = new JButton("Login"));
        p.add(btnReset = new JButton("Reset"));

        btnLogin.setIcon(new ImageIcon(this.getClass().getResource("/hinhanh/login.png")));
        btnReset.setIcon(new ImageIcon(this.getClass().getResource("/hinhanh/reboot.png")));

        add(p);
    }

    public static void main(String[] args) {
        LoginFrame frm = new LoginFrame("Login Systems");
        frm.setVisible(true);
    }

    private void processEvent() {
        btnLogin.addActionListener((ActionEvent e) -> {
            String user = txtUser.getText();
            String pass = txtPass.getText();
            if (user.equals("admin") || pass.equals("admin")) {
                JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
            } else {
                JOptionPane.showMessageDialog(null, "Dang nhap that bai","THong bao loi",JOptionPane.ERROR_MESSAGE);
            }
        });

        btnReset.addActionListener((ActionEvent e) -> {
            txtUser.setText("");
            txtPass.setText("");
            txtUser.requestFocus();
        });
    }
}
