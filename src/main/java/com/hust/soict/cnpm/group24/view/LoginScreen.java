/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hust.soict.cnpm.group24.view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.hust.soict.cnpm.group24.controller.LoginController;
import com.hust.soict.cnpm.group24.model.dao.LoginDAO;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 * @author ADMIN
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        account_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        account_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        login_bt_panel = new javax.swing.JPanel();
        login_bt_label = new javax.swing.JLabel();
        login_message_panel = new javax.swing.JPanel();
        login_message_label = new javax.swing.JLabel();
        back_ground_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blue Manager - Đăng nhập");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(0, 0, 0,40));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_label.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("ĐĂNG NHẬP");
        login_panel.add(login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 41));

        account_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        account_label.setForeground(new java.awt.Color(255, 255, 255));
        account_label.setText("Tài khoản:");
        login_panel.add(account_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 40));

        password_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Mật khẩu:");
        login_panel.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        account_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        account_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        account_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                account_fieldKeyPressed(evt);
            }
        });
        login_panel.add(account_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, 40));

        password_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_fieldKeyPressed(evt);
            }
        });
        login_panel.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 40));

        login_bt_panel.setBackground(new java.awt.Color(204, 255, 255));
        login_bt_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_bt_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_bt_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                login_bt_panelMousePressed(evt);
            }
        });

        login_bt_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_bt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_bt_label.setText("Login");

        javax.swing.GroupLayout login_bt_panelLayout = new javax.swing.GroupLayout(login_bt_panel);
        login_bt_panel.setLayout(login_bt_panelLayout);
        login_bt_panelLayout.setHorizontalGroup(
            login_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        login_bt_panelLayout.setVerticalGroup(
            login_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        login_panel.add(login_bt_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        login_message_panel.setBackground(new java.awt.Color(0, 0, 0,0));

        login_message_label.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        login_message_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout login_message_panelLayout = new javax.swing.GroupLayout(login_message_panel);
        login_message_panel.setLayout(login_message_panelLayout);
        login_message_panelLayout.setHorizontalGroup(
            login_message_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        login_message_panelLayout.setVerticalGroup(
            login_message_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        login_panel.add(login_message_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 400, 340));

        back_ground_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blue_moon3.jpg"))); // NOI18N
        getContentPane().add(back_ground_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_bt_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMousePressed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_login_bt_panelMousePressed

    public void login(){
        String username = account_field.getText();
        char[] passwordChar = password_field.getPassword();
        String password = new String(passwordChar);
        if (LoginController.dangNhap(username,password)) {
            MainScreen.showMainScreen();
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(this, "Nhập sai tên đăng nhập hoặc mật khẩu, mời nhập lại!","Đăng nhập",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void login_bt_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMouseExited
        // TODO add your handling code here:
        login_bt_panel.setBackground(new Color(204, 255, 255));
    }//GEN-LAST:event_login_bt_panelMouseExited

    private void login_bt_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMouseEntered
        // TODO add your handling code here:
        login_bt_panel.setBackground(new Color(51, 255, 255));
    }//GEN-LAST:event_login_bt_panelMouseEntered

    private void account_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_account_fieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_account_fieldKeyPressed

    private void password_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_fieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_password_fieldKeyPressed

    public static void showLogin() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_field;
    private javax.swing.JLabel account_label;
    private javax.swing.JLabel back_ground_label;
    private javax.swing.JLabel login_bt_label;
    private javax.swing.JPanel login_bt_panel;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel login_message_label;
    private javax.swing.JPanel login_message_panel;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label;
    // End of variables declaration//GEN-END:variables
}
