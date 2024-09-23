/*
 */
package jtable;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DemoJTable extends JFrame {

    private DefaultTableModel model;
    private JTable tblTaiKhoan;
    private JButton btnThem, btnXoa;
    private JLabel lblTen, lblTien;
    private JTextField txtTen, txtTien;

    public DemoJTable(String title) {
        super(title);
        createGUI();
        processEvent();
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        DemoJTable frm = new DemoJTable("Demo JTable");
        frm.setVisible(true);
    }

    private void createGUI() {
        Object[][] data = {{"Nguyen Thanh Tu", "150000"},
        {"Nguyen Huu Tai", "200000"},
        {"Nguyen Tan Phat", "250000"},};
        String[] columnNames = {"Ten tai khoan", "So tien"};
        //tao table
        //tblTaiKhoan = new JTable(data, columnNames);

        //cach 2
        model = new DefaultTableModel(data, columnNames);
        tblTaiKhoan = new JTable(model);

        //tao thanh phan quan ly cuon JTable
        JScrollPane scrollTable = new JScrollPane(tblTaiKhoan);

        JPanel p = new JPanel();
        p.add(lblTen = new JLabel("Ten tai khoan"));
        p.add(txtTen = new JTextField(10));
        p.add(lblTien = new JLabel("So tien"));
        p.add(txtTien = new JTextField(10));
        p.add(btnThem = new JButton("Them"));
        p.add(btnXoa = new JButton("Xoa"));

        //add JTable vao cua so
        add(scrollTable, BorderLayout.CENTER);
        add(p, BorderLayout.NORTH);
    }

    private void processEvent() {
        //xu ly nut them
        btnThem.addActionListener((ActionEvent e) -> {
            {
                String error = "";
                try {
                    String tenTaiKhoan = txtTen.getText();
                    String soTien = txtTien.getText();

                    if (tenTaiKhoan.length() == 0) {
                        error = "Ban chua nhap ten tai khoan";
                    }
                    if (soTien.length() == 0) {
                        error = "Ban chua nhap so tien";
                    }
                    double tien = Double.parseDouble(txtTien.getText());

                    if (error.length() > 0) {
                        JOptionPane.showMessageDialog(this, error, "Loi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    model.addRow(new Object[]{tenTaiKhoan, soTien});
                } catch (Exception ex) {
                    error += "\nNhap sai kieu so tien";
                    JOptionPane.showMessageDialog(this, error, "Loi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //xu ly nut xoa
        btnXoa.addActionListener((ActionEvent e) -> {
            {
                //lay chi so dong duoc chon trong JTable
                int selectedIndex = tblTaiKhoan.getSelectedRow();
                //xoa dong du lieu tuong ung
                if (selectedIndex >= 0) {//neu co dong duoc chon
                    if (JOptionPane.showConfirmDialog(this, "Ban co muon xoa dong duoc chon khong") == JOptionPane.OK_OPTION) {
                        model.removeRow(selectedIndex);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Chua chon dong can xoa");
                }
            }
        });
    }
}
