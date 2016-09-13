/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pto.login;

import com.leapfrog.pto.register.RegisterUI;
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
public class LoginUI extends JFrame {

    private JLabel lblEmail;
    private JLabel lblPwd;
    private JTextField txtEmail;
    private JTextField txtPwd;
    private JButton btnLogin, btnRegister;

    public LoginUI() {
        setTitle("Login");
        setSize(450, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginComponents();
        setVisible(true);

    }

    private void loginComponents() {
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField(30);
        lblPwd = new JLabel("Password");
        txtPwd = new JTextField(30);
        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegisterUI();
                setVisible(false);
            }
        });

        add(lblEmail);
        add(txtEmail);
        add(lblPwd);
        add(txtPwd);
        add(btnLogin);
        add(btnRegister);

    }

}
