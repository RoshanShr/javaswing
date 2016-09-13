/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pto.menu;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sagar
 */
public class MenuUI extends JFrame {

    private JButton btnSales, btnPurchase, btnTotal, btnBill;

    public MenuUI() {
        setTitle("Menu");
        setSize(450, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuComponents();
        setVisible(true);
    }

    private void menuComponents() {

        btnSales = new JButton("Sales");
        btnPurchase = new JButton("Purchase");
        btnTotal = new JButton("Total");
        btnBill = new JButton("Bill");

        add(btnSales);
        add(btnPurchase);
        add(btnTotal);
        add(btnBill);

    }

}
