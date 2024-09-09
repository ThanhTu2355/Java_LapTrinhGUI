/*
 */
package com.bt01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TinhToanDonGian extends JFrame {

    private JLabel lb1, lb2, lb3;
    private JTextField txtSo1, txtSo2, txtKq;
    private JButton btnCong, btnTru, btnNhan, btnChia;

    public static void main(String[] args) {
        TinhToanDonGian frm = new TinhToanDonGian();
        frm.setVisible(true);
    }

    public TinhToanDonGian() {
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(lb1 = new JLabel("So 1"));
        p1.add(txtSo1 = new JTextField());
        p1.add(lb2 = new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());
        p1.add(lb3 = new JLabel("Ket qua"));
        p1.add(txtKq = new JTextField());

        JPanel p2 = new JPanel();
        p2.add(btnCong = new JButton("Cong"));
        p2.add(btnTru = new JButton("Tru"));
        p2.add(btnNhan = new JButton("Nhan"));
        p2.add(btnChia = new JButton("Chia"));

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        //xu ly cong
        btnCong.addActionListener((ActionEvent e) -> {
            double x1 = Double.parseDouble(txtSo1.getText());
            double y1 = Double.parseDouble(txtSo2.getText());
            double kq = x1 + y1;
            txtKq.setText(String.valueOf(kq));
        });
        //xu ly tru
        btnTru.addActionListener((ActionEvent e) -> {
            double x1 = Double.parseDouble(txtSo1.getText());
            double y1 = Double.parseDouble(txtSo2.getText());
            double kq = x1 - y1;
            txtKq.setText(String.valueOf(kq));
        });
        //xu ly nhan
        btnNhan.addActionListener((ActionEvent e) -> {
            double x1 = Double.parseDouble(txtSo1.getText());
            double y1 = Double.parseDouble(txtSo2.getText());
            double kq = x1 * y1;
            txtKq.setText(String.valueOf(kq));
        });
        //xu ly cong
        btnChia.addActionListener((ActionEvent e) -> {
            double x1 = Double.parseDouble(txtSo1.getText());
            double y1 = Double.parseDouble(txtSo2.getText());
            double kq = x1 / y1;
            txtKq.setText(String.valueOf(kq));
        });
    }
}
