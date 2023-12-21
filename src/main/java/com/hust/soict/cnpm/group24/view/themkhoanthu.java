/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hust.soict.cnpm.group24.view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.hust.soict.cnpm.group24.model.entity.KhoanPhi;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class themkhoanthu extends javax.swing.JFrame {

    /**
     * Creates new form themkhoanthu
     */
    public themkhoanthu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tenkhoanthuTextField = new javax.swing.JTextField();
        makhoanthuTextField = new javax.swing.JTextField();
        dongiaTextField = new javax.swing.JTextField();
        themButton = new com.k33ptoo.components.KButton();
        huyButton = new com.k33ptoo.components.KButton();
        loaikhoanthuComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm khoản thu");

        kGradientPanel1.setPreferredSize(new java.awt.Dimension(900, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Thêm khoản thu");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Loại khoản thu");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Đơn giá");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Tên khoản thu");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Mã khoản thu");

        tenkhoanthuTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tenkhoanthuTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tenkhoanthuTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tenkhoanthuTextFieldFocusLost(evt);
            }
        });

        makhoanthuTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        makhoanthuTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        makhoanthuTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                makhoanthuTextFieldFocusLost(evt);
            }
        });

        dongiaTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        dongiaTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dongiaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dongiaTextFieldFocusLost(evt);
            }
        });

        themButton.setText("Thêm");
        themButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        themButton.setkBackGroundColor(new java.awt.Color(36, 193, 93));
        themButton.setkEndColor(new java.awt.Color(36, 193, 93));
        themButton.setkHoverEndColor(new java.awt.Color(36, 193, 93));
        themButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        themButton.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        themButton.setkPressedColor(new java.awt.Color(0, 51, 51));
        themButton.setkStartColor(new java.awt.Color(36, 193, 93));
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        huyButton.setText("Huỷ");
        huyButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        huyButton.setkBackGroundColor(new java.awt.Color(102, 102, 102));
        huyButton.setkEndColor(new java.awt.Color(153, 153, 153));
        huyButton.setkForeGround(new java.awt.Color(0, 0, 0));
        huyButton.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        huyButton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        huyButton.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        huyButton.setkPressedColor(new java.awt.Color(153, 153, 153));
        huyButton.setkStartColor(new java.awt.Color(153, 153, 153));
        huyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyButtonActionPerformed(evt);
            }
        });

        loaikhoanthuComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loaikhoanthuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bắt buộc", "Tự nguyện", "Phí gửi xe máy", "Phí gửi ô tô" }));
        loaikhoanthuComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loaikhoanthuComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loaikhoanthuComboBoxFocusLost(evt);
            }
        });
        loaikhoanthuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaikhoanthuComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("(*)");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dongiaTextField)
                        .addComponent(makhoanthuTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                        .addComponent(loaikhoanthuComboBox, 0, 416, Short.MAX_VALUE)
                        .addComponent(tenkhoanthuTextField))
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(makhoanthuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tenkhoanthuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(loaikhoanthuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11))
                    .addComponent(dongiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loaikhoanthuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaikhoanthuComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaikhoanthuComboBoxActionPerformed

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_huyButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm không?");
        if (x == JOptionPane.YES_OPTION) {
           
            String maKhoanThu;
            String tenKhoanThu;
            String loaiKhoanThu;
            float donGia;
            
            maKhoanThu = makhoanthuTextField.getText();
            tenKhoanThu = tenkhoanthuTextField.getText();
            loaiKhoanThu = loaikhoanthuComboBox.getActionCommand();
            donGia = Float.parseFloat(dongiaTextField.getText());
            
            KhoanPhi khoanPhi = new KhoanPhi(maKhoanThu, tenKhoanThu, loaiKhoanThu, donGia);
            //home.addKhoanPhi(khoanPhi);
            this.dispose();
        }
    }//GEN-LAST:event_themButtonActionPerformed

    private void makhoanthuTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_makhoanthuTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String makhoanthu = makhoanthuTextField.getText();
            if (makhoanthu.length() > 0) {
            } else if (makhoanthu.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Mã khoản thu không được để trống");
            }
        }

    }//GEN-LAST:event_makhoanthuTextFieldFocusLost

    private void tenkhoanthuTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenkhoanthuTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String tenkhoanthu = tenkhoanthuTextField.getText();
            if (tenkhoanthu.length() > 0) {
            } else if (tenkhoanthu.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Tên khoản thu không được để trống");
            }
        }
    }//GEN-LAST:event_tenkhoanthuTextFieldFocusLost

    private void loaikhoanthuComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loaikhoanthuComboBoxFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String loaikhoanthu = loaikhoanthuComboBox.getActionCommand();
            if (loaikhoanthu.length() > 0) {
            } else if (loaikhoanthu.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Loại khoản thu không được để trống");
            }
        }
    }//GEN-LAST:event_loaikhoanthuComboBoxFocusLost

    private void dongiaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dongiaTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            if (dongiaTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Đơn giá không được để trống");
                //  dientichTextField.requestFocus();
                return;
            }

            try {
                float donGia = Float.parseFloat(dongiaTextField.getText());

                if (donGia <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Đơn giá lớn hơn không");
                    dongiaTextField.setText("");
                    // dientichTextField.requestFocus();
                    return;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng số");
                dongiaTextField.setText("");
                // dientichTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_dongiaTextFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(themkhoanthu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themkhoanthu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themkhoanthu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themkhoanthu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new themkhoanthu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dongiaTextField;
    private com.k33ptoo.components.KButton huyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> loaikhoanthuComboBox;
    private javax.swing.JTextField makhoanthuTextField;
    private javax.swing.JTextField tenkhoanthuTextField;
    private com.k33ptoo.components.KButton themButton;
    // End of variables declaration//GEN-END:variables
}
