
package com.hust.soict.cnpm.group24.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UpdateSHK extends javax.swing.JFrame {

    
    public UpdateSHK() {
        initComponents();        
        this.setLocationRelativeTo(null);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        luuButton = new com.k33ptoo.components.KButton();
        mahoTextField = new javax.swing.JTextField();
        tenchuhoTextField = new javax.swing.JTextField();
        dientichTextField = new javax.swing.JTextField();
        sootoTextField = new javax.swing.JTextField();
        soxemayTextField = new javax.swing.JTextField();
        huyButton = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sủa thông tin Sổ hộ khẩu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Sửa thông tin Sổ hộ khẩu");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Diện tích");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Số ô tô");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Tên chủ hộ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Mã hộ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Mã hộ khẩu");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Số xe máy");

        luuButton.setText("Lưu");
        luuButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        luuButton.setkBackGroundColor(new java.awt.Color(36, 193, 93));
        luuButton.setkEndColor(new java.awt.Color(36, 193, 93));
        luuButton.setkHoverEndColor(new java.awt.Color(36, 193, 93));
        luuButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        luuButton.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        luuButton.setkPressedColor(new java.awt.Color(0, 51, 51));
        luuButton.setkStartColor(new java.awt.Color(36, 193, 93));
        luuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButtonActionPerformed(evt);
            }
        });

        mahoTextField.setEditable(false);
        mahoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mahoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mahoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mahoTextFieldActionPerformed(evt);
            }
        });

        tenchuhoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tenchuhoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tenchuhoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tenchuhoTextFieldFocusLost(evt);
            }
        });

        dientichTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        dientichTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dientichTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dientichTextFieldFocusLost(evt);
            }
        });

        sootoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        sootoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sootoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sootoTextFieldFocusLost(evt);
            }
        });

        soxemayTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        soxemayTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        soxemayTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                soxemayTextFieldFocusLost(evt);
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

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soxemayTextField)
                            .addComponent(sootoTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mahoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(tenchuhoTextField)
                            .addComponent(dientichTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(387, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(228, 228, 228)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(mahoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tenchuhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dientichTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(soxemayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sootoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(375, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(202, 202, 202)))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa không?");
        if(x == JOptionPane.YES_OPTION){
        
            String maHo, chuHo;
            float dienTich;
            int soXeMay = 0;
            int soOTo = 0;
            
            maHo = mahoTextField.getText();
            chuHo = tenchuhoTextField.getText();
            dienTich = Float.parseFloat(mahoTextField.getText());
            soXeMay = Integer.parseInt(soxemayTextField.getText());
            soOTo = Integer.parseInt(sootoTextField.getText());
            
            HoKhau hoKhau = new HoKhau(maHo, chuHo, dienTich);
            //home.updateHoKhau(hoKhau);
            this.dispose();
        
        }
    }//GEN-LAST:event_luuButtonActionPerformed

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_huyButtonActionPerformed

    private void mahoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mahoTextFieldActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_mahoTextFieldActionPerformed

    private void tenchuhoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenchuhoTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String tenChuHo = tenchuhoTextField.getText();
            if (tenChuHo.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Tên chủ hộ không được để trống");
            }
        }
    }//GEN-LAST:event_tenchuhoTextFieldFocusLost

    private void dientichTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dientichTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            if (dientichTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Diện tích không được để trống");
                //  dientichTextField.requestFocus();
                return;
            }

            try {
                float dienTich = Float.parseFloat(dientichTextField.getText());

                if (dienTich <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Diện tích lớn hơn không");
                    dientichTextField.setText("");
                    // dientichTextField.requestFocus();
                    return;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng số");
                dientichTextField.setText("");
                // dientichTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_dientichTextFieldFocusLost

    private void soxemayTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_soxemayTextFieldFocusLost
        // TODO add your handling code here:
        if (soxemayTextField.getText().isEmpty()) {
            soxemayTextField.setText("0");
        } else {
            try {
                int soXeMay = Integer.parseInt(soxemayTextField.getText());
                if (soXeMay < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Số xe máy không được là số âm");
                    soxemayTextField.setText("0");
                    //  soxemayTextField.requestFocus();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng số");
                soxemayTextField.setText("0");
                // soxemayTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_soxemayTextFieldFocusLost

    private void sootoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sootoTextFieldFocusLost
        // TODO add your handling code here:
        if (sootoTextField.getText().isEmpty()) {
            sootoTextField.setText("0");
        } else {
            try {
                int soOTo = Integer.parseInt(sootoTextField.getText());
                if (soOTo < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Số ô tô không được là số âm");
                    sootoTextField.setText("0");
                    //   sootoTextField.requestFocus();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng số");
                soxemayTextField.setText("0");
                // soxemayTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_sootoTextFieldFocusLost

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
            java.util.logging.Logger.getLogger(UpdateSHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UpdateSHK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dientichTextField;
    private com.k33ptoo.components.KButton huyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton luuButton;
    private javax.swing.JTextField mahoTextField;
    private javax.swing.JTextField sootoTextField;
    private javax.swing.JTextField soxemayTextField;
    private javax.swing.JTextField tenchuhoTextField;
    // End of variables declaration//GEN-END:variables

public void updateHoKhau(HoKhau hk){
   // hokhau.remove();
   // this.addHoKhau(hk);
}

}

