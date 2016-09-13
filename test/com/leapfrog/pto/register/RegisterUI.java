/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pto.register;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sagar
 */
public class RegisterUI extends JFrame {

    private JLabel lblFname;
    private JLabel lblLname;
    private JLabel lblEmail;
    private JLabel lblPwd;
    private JLabel lblCpwd;
    private JTextField txtFname;
    private JTextField txtLname;
    private JTextField txtEmail;
    private JTextField txtPwd;
    private JTextField txtCpwd;
    private JButton btnRegister, btnClear;

    public RegisterUI() {
        setTitle("Register");
        setSize(450, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regComponents();
        setVisible(true);
    }

    private void regComponents() {
        lblFname = new JLabel("First Name");
        txtFname = new JTextField(30);
        lblLname = new JLabel("Last Name");
        txtLname = new JTextField(30);
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField(30);
        lblPwd = new JLabel("Password");
        txtPwd = new JTextField(30);
        lblCpwd = new JLabel("Confirm Password");
        txtCpwd = new JTextField(30);
        btnRegister = new JButton("Register");
        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFname.setText("");
            }
        });

        add(lblFname);
        add(txtFname);
        add(lblLname);
        add(txtLname);
        add(lblEmail);
        add(txtEmail);
        add(lblPwd);
        add(txtPwd);
        add(lblCpwd);
        add(txtCpwd);
        add(btnRegister);
        add(btnClear);
    }
}
