/*
 */
package com.bt02;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MayTinhDonGian extends JFrame {

    private JTextField txtDisplay;
    private JButton btnReset;
    private JButton[] bt = new JButton[16];
    private String[] str = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", ".", "=", "/"};

    public MayTinhDonGian() {
        setTitle("May tinh");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {

        JPanel p1 = new JPanel();
        p1.add(txtDisplay = new JTextField(30));
        p1.add(btnReset = new JButton("C"));
        //nut reset
        //tiep nhan su kiem cho cac nut
        btnReset.addActionListener((ActionEvent e) -> {
            txtDisplay.setText("");
        });

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            p2.add(bt[i]);

            //tiep nhan su kiem cho cac nut
            bt[i].addActionListener((ActionEvent e) -> {
                txtDisplay.setText(txtDisplay.getText() + e.getActionCommand());
            });
        }

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MayTinhDonGian frm = new MayTinhDonGian();
        frm.setVisible(true);
    }
}
