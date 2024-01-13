package com.hust.soict.cnpm.group24.view.hokhauview;

import com.formdev.flatlaf.FlatLightLaf;
import com.hust.soict.cnpm.group24.controller.HoKhauController;
import com.hust.soict.cnpm.group24.model.entity.HoKhau;
import com.hust.soict.cnpm.group24.view.MainScreen;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CapNhatHoKhau extends javax.swing.JFrame {
    private MainScreen parentContext;
    private int selectedRow;
    public CapNhatHoKhau(MainScreen pContext,int row) {
        initComponents();
        parentContext = pContext;
        this.selectedRow = row;
        this.setLocationRelativeTo(null);
        String maHoKhau = parentContext.getHo_khau_table().getValueAt(selectedRow, 0).toString();
        String tenChuHo = parentContext.getHo_khau_table().getValueAt(selectedRow, 1).toString();
        String dienTich = parentContext.getHo_khau_table().getValueAt(selectedRow, 3).toString();
        String soXeMay = parentContext.getHo_khau_table().getValueAt(selectedRow, 4).toString();
        String soOto = parentContext.getHo_khau_table().getValueAt(selectedRow, 5).toString();
        mahoTextField.setText(maHoKhau);
        tenchuhoTextField.setText(tenChuHo);
        dientichTextField.setText(dienTich);
        soxemayTextField.setText(soXeMay);
        sootoTextField.setText(soOto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mahoTextField = new javax.swing.JTextField();
        tenchuhoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        soxemayTextField = new javax.swing.JTextField();
        dientichTextField = new javax.swing.JTextField();
        sootoTextField = new javax.swing.JTextField();
        huyButton = new com.k33ptoo.components.KButton();
        themButton = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loiLable = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sủa thông tin Sổ hộ khẩu");

        kGradientPanel2.setkBorderRadius(70);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Cập nhật hộ khẩu");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Diện tích(m²)");

        mahoTextField.setEditable(false);
        mahoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mahoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tenchuhoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tenchuhoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tenchuhoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tenchuhoTextFieldFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Mã hộ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Tên chủ hộ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Số xe máy");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Số ô tô");

        soxemayTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        soxemayTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        soxemayTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                soxemayTextFieldFocusLost(evt);
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

        huyButton.setText("Hủy");
        huyButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        huyButton.setkBackGroundColor(new java.awt.Color(102, 102, 102));
        huyButton.setkEndColor(new java.awt.Color(153, 153, 153));
        huyButton.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        huyButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        huyButton.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        huyButton.setkPressedColor(new java.awt.Color(153, 153, 153));
        huyButton.setkStartColor(new java.awt.Color(153, 153, 153));
        huyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyButtonActionPerformed(evt);
            }
        });

        themButton.setText("Lưu");
        themButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("(*)");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(loiLable, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(mahoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel4)))
                                .addGap(34, 34, 34))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tenchuhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dientichTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soxemayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sootoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mahoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addComponent(loiLable)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenchuhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dientichTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(soxemayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sootoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void tenchuhoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenchuhoTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String tenChuHo = tenchuhoTextField.getText();
            if (tenChuHo.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Tên chủ hộ không được để trống");
            } else if(tenChuHo.length() > 100){
                JOptionPane.showMessageDialog(rootPane, "Tên chủ hộ không được quá 100 ký tự");
            }
        }
    }//GEN-LAST:event_tenchuhoTextFieldFocusLost

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

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_huyButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa không?");
        if (x == JOptionPane.YES_OPTION) {

            String maHo, chuHo;
            double dienTich;
            int soXeMay = 0;
            int soOTo = 0;

            maHo = mahoTextField.getText();
            chuHo = tenchuhoTextField.getText();
            dienTich = Double.parseDouble(dientichTextField.getText());
            soXeMay = Integer.parseInt(soxemayTextField.getText());
            soOTo = Integer.parseInt(sootoTextField.getText());

            HoKhau hoKhau = new HoKhau(maHo, chuHo, dienTich, soOTo, soXeMay);
            if (HoKhauController.suaHoKhau(hoKhau)) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!", "Cập nhật hộ khẩu", JOptionPane.INFORMATION_MESSAGE);
                parentContext.loadHoKhauTable();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!", "Cập nhật hộ khẩu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_themButtonActionPerformed

    public static void showUpdateHoKhau(MainScreen pContext, int row) {
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
            java.util.logging.Logger.getLogger(CapNhatHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CapNhatHoKhau(pContext,row).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dientichTextField;
    private com.k33ptoo.components.KButton huyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel loiLable;
    private javax.swing.JTextField mahoTextField;
    private javax.swing.JTextField sootoTextField;
    private javax.swing.JTextField soxemayTextField;
    private javax.swing.JTextField tenchuhoTextField;
    private com.k33ptoo.components.KButton themButton;
    // End of variables declaration//GEN-END:variables
}
