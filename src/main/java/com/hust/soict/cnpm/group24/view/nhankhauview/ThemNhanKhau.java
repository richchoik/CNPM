package com.hust.soict.cnpm.group24.view.nhankhauview;

import com.formdev.flatlaf.FlatLightLaf;
import com.hust.soict.cnpm.group24.controller.NhanKhauController;
import com.hust.soict.cnpm.group24.model.entity.NhanKhau;
import com.hust.soict.cnpm.group24.view.MainScreenShow;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.Date;

public class ThemNhanKhau extends javax.swing.JFrame {
    private MainScreenShow parentContext;
    public ThemNhanKhau(MainScreenShow pContext) {
        initComponents();
        parentContext = pContext;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gioitinhbuttonGroup = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tennhankhauTextField = new javax.swing.JTextField();
        socccdTextField = new javax.swing.JTextField();
        quanhevoichuhoTextField = new javax.swing.JTextField();
        mahokhauTextField = new javax.swing.JTextField();
        sodienthoaiTextField = new javax.swing.JTextField();
        themButton = new com.k33ptoo.components.KButton();
        huyButton = new com.k33ptoo.components.KButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ngaysinhDateChooser = new com.toedter.calendar.JDateChooser();
        namRadioButton = new javax.swing.JRadioButton();
        nuRadioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        quocTichTextField = new javax.swing.JTextField();
        manhankhauTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm nhân khẩu");

        kGradientPanel2.setkBorderRadius(70);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Quan hệ với chủ hộ");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Số điện thoại");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Mã hộ khẩu");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Số CCCD");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Tên nhân khẩu");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setText("Ngày sinh");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Mã nhân khẩu");

        tennhankhauTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tennhankhauTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tennhankhauTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tennhankhauTextFieldFocusLost(evt);
            }
        });

        socccdTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        socccdTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        socccdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                socccdTextFieldFocusLost(evt);
            }
        });

        quanhevoichuhoTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        quanhevoichuhoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quanhevoichuhoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quanhevoichuhoTextFieldFocusLost(evt);
            }
        });

        mahokhauTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mahokhauTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mahokhauTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mahokhauTextFieldFocusLost(evt);
            }
        });

        sodienthoaiTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        sodienthoaiTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sodienthoaiTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sodienthoaiTextFieldFocusLost(evt);
            }
        });

        themButton.setText("Thêm");
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

        huyButton.setText("Huỷ");
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

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Giới tính");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        ngaysinhDateChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ngaysinhDateChooser.setDateFormatString("dd/MM/yyyy");
        ngaysinhDateChooser.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ngaysinhDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ngaysinhDateChooserFocusLost(evt);
            }
        });

        gioitinhbuttonGroup.add(namRadioButton);
        namRadioButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        namRadioButton.setText("Nam");

        gioitinhbuttonGroup.add(nuRadioButton);
        nuRadioButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nuRadioButton.setText("Nữ");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("(*)");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("(*)");

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("(*)");

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("(*)");

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("(*)");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel25.setText("Quốc tịch");

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("(*)");

        quocTichTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        quocTichTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quocTichTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quocTichTextFieldFocusLost(evt);
            }
        });

        manhankhauTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        manhankhauTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manhankhauTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                manhankhauTextFieldFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Thêm nhân khẩu");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(namRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nuRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(socccdTextField)
                                            .addComponent(ngaysinhDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                            .addComponent(tennhankhauTextField)))))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(manhankhauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115)))
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mahokhauTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quanhevoichuhoTextField)
                    .addComponent(sodienthoaiTextField)
                    .addComponent(quocTichTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel9)
                            .addComponent(manhankhauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(tennhankhauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(35, 35, 35)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ngaysinhDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20))
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(namRadioButton)
                                .addComponent(nuRadioButton))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(quocTichTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(sodienthoaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(mahokhauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(quanhevoichuhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))))
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(socccdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        ngaysinhDateChooser.getAccessibleContext().setAccessibleName("");
        ngaysinhDateChooser.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
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

    private void manhankhauTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manhankhauTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_manhankhauTextFieldFocusLost

    private void quocTichTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quocTichTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_quocTichTextFieldFocusLost

    private void ngaysinhDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngaysinhDateChooserFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String ngaysinh = ngaysinhDateChooser.getDateFormatString();
            if (ngaysinh.length() > 0) {
            } else if (ngaysinh.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Ngày sinh không được để trống");
            }
        }
    }//GEN-LAST:event_ngaysinhDateChooserFocusLost

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_huyButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm không?");
        if (x == JOptionPane.YES_OPTION) {

            String id = manhankhauTextField.getText();
            String hoTen = tennhankhauTextField.getText();
            String gioiTinh = "";
            java.util.Date ns = ngaysinhDateChooser.getDate();
            if (namRadioButton.isSelected()) {
                gioiTinh = namRadioButton.getText();
            } else if (nuRadioButton.isSelected()) {
                gioiTinh = nuRadioButton.getText();
            }
            String cccd = socccdTextField.getText();
            String quocTich = quocTichTextField.getText();
            //Date ngaySinh = Date.valueOf("2023-07-06");
            java.sql.Date ngaySinh = new java.sql.Date(ns.getTime());
            String soDienThoai = sodienthoaiTextField.getText();
            String maHo = mahokhauTextField.getText();
            String quanHeChuHo = quanhevoichuhoTextField.getText();

            NhanKhau nhanKhau = new NhanKhau(id, hoTen, gioiTinh, cccd, quocTich, ngaySinh, soDienThoai, maHo, quanHeChuHo);
            if (NhanKhauController.themNhanKhau(nhanKhau)) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Thêm nhân khẩu", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại, mã nhân khẩu đã tồn tại!", "Thêm nhân khẩu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_themButtonActionPerformed

    private void sodienthoaiTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sodienthoaiTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String sodienthoai = sodienthoaiTextField.getText();
            if (sodienthoai.length() > 0) {
            } else if (sodienthoai.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại không được để trống");
            } else if (sodienthoai.length() > 10) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại nhỏ hơn 10 số");
            }
        }
    }//GEN-LAST:event_sodienthoaiTextFieldFocusLost

    private void mahokhauTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mahokhauTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String mahokhau = mahokhauTextField.getText();
            if (mahokhau.length() > 0) {
            } else if (mahokhau.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Mã hộ khẩu không được để trống");
            }
        }
    }//GEN-LAST:event_mahokhauTextFieldFocusLost

    private void quanhevoichuhoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quanhevoichuhoTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String quanhevoichuho = quanhevoichuhoTextField.getText();
            if (quanhevoichuho.length() > 0) {
            } else if (quanhevoichuho.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Quan hệ với chủ hộ không được để trống");
            }
        }
    }//GEN-LAST:event_quanhevoichuhoTextFieldFocusLost

    private void socccdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_socccdTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String socccd = socccdTextField.getText();
            if (socccd.length() > 0) {
            } else if (socccd.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Quan hệ với chủ hộ không được để trống");
            } else if (socccd.length() > 12) {
                JOptionPane.showMessageDialog(rootPane, "Căn cước công dân nhỏ hơn 12 số");
            }
        }
    }//GEN-LAST:event_socccdTextFieldFocusLost

    private void tennhankhauTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tennhankhauTextFieldFocusLost
        // TODO add your handling code here:
        if (this.isVisible()) {
            String tenNhanKhau = tennhankhauTextField.getText().trim();
            // Kiểm tra xem văn bản có rỗng không
            if (tenNhanKhau.isEmpty()) {
                // Hiển thị thông báo nếu rỗng
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhân khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                // Thực hiện xử lý khi có dữ liệu
                // TODO: Thêm mã xử lý khi có dữ liệu nhập vào đây
            }
        }
    }//GEN-LAST:event_tennhankhauTextFieldFocusLost

    public static void showThemNhanKhau(MainScreenShow pContext) {
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
            java.util.logging.Logger.getLogger(ThemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ThemNhanKhau(pContext).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gioitinhbuttonGroup;
    private com.k33ptoo.components.KButton huyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField mahokhauTextField;
    private javax.swing.JTextField manhankhauTextField;
    private javax.swing.JRadioButton namRadioButton;
    private com.toedter.calendar.JDateChooser ngaysinhDateChooser;
    private javax.swing.JRadioButton nuRadioButton;
    private javax.swing.JTextField quanhevoichuhoTextField;
    private javax.swing.JTextField quocTichTextField;
    private javax.swing.JTextField socccdTextField;
    private javax.swing.JTextField sodienthoaiTextField;
    private javax.swing.JTextField tennhankhauTextField;
    private com.k33ptoo.components.KButton themButton;
    // End of variables declaration//GEN-END:variables
}
