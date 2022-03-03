
package form;

import dinhdang.Bao;
import dinhdang.Sach;
import dinhdang.TapChi;
import quanlythuvien.QuanLyThuVien;

public class Add extends javax.swing.JFrame {

    QuanLyThuVien quanLyThuVien;

    public Add() {
        initComponents();
        quanLyThuVien= new QuanLyThuVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhomloai = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radiosach = new javax.swing.JRadioButton();
        radiotapchi = new javax.swing.JRadioButton();
        radiobao = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldtenxnb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldsoban = new javax.swing.JTextField();
        jLabelText3 = new javax.swing.JLabel();
        jTextFieldthu3 = new javax.swing.JTextField();
        jLabelText4 = new javax.swing.JLabel();
        jTextFieldthu4 = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thêm tài liệu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Loại");

        nhomloai.add(radiosach);
        radiosach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiosach.setSelected(true);
        radiosach.setText("Sách");
        radiosach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosachActionPerformed(evt);
            }
        });

        nhomloai.add(radiotapchi);
        radiotapchi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiotapchi.setText("Tạp chí");
        radiotapchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiotapchiActionPerformed(evt);
            }
        });

        nhomloai.add(radiobao);
        radiobao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiobao.setText("Báo");
        radiobao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên NXB");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số bản p/h");

        jLabelText3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelText3.setText("Tên TG");

        jLabelText4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelText4.setText("Số trang");

        jButtonAdd.setBackground(new java.awt.Color(102, 255, 102));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Thêm");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabelText3)
                    .addComponent(jLabelText4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radiosach)
                                .addGap(18, 18, 18)
                                .addComponent(radiotapchi)
                                .addGap(18, 18, 18)
                                .addComponent(radiobao))
                            .addComponent(jTextFieldtenxnb)
                            .addComponent(jTextFieldsoban)
                            .addComponent(jTextFieldthu3)
                            .addComponent(jTextFieldthu4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiosach)
                    .addComponent(radiotapchi)
                    .addComponent(radiobao)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldtenxnb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldsoban, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelText3)
                    .addComponent(jTextFieldthu3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelText4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldthu4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radiosachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiosachActionPerformed
        jLabelText3.setText("Tên TG");
        jLabelText4.setText("Số trang");
        jTextFieldthu4.setEnabled(true);
        jTextFieldthu3.setText("");
    }//GEN-LAST:event_radiosachActionPerformed

    private void radiotapchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiotapchiActionPerformed
        jLabelText3.setText("Số p/h");
        jLabelText4.setText("Tháng p/h");
        jTextFieldthu4.setEnabled(true);
        jTextFieldthu3.setText("");
    }//GEN-LAST:event_radiotapchiActionPerformed

    private void radiobaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobaoActionPerformed
        jLabelText3.setText("Ngày p/h");
        jTextFieldthu3.setText("yyyy/mm/dd");
        jLabelText4.setText("-------");
        jTextFieldthu4.setEnabled(false);
    }//GEN-LAST:event_radiobaoActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (radiosach.isSelected())
        {
            Sach sach = new Sach();
            sach.setTenNhaXB(jTextFieldtenxnb.getText());
            sach.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            sach.setTenTGia(jTextFieldthu3.getText());
            sach.setSoTrang(Integer.parseInt(jTextFieldthu4.getText()));
            
            quanLyThuVien.addSach(sach);
            new Main("SA000").setVisible(true);
            this.dispose();
        }
        if (radiotapchi.isSelected())
        {
            TapChi tapchi = new TapChi();
            tapchi.setTenNhaXB(jTextFieldtenxnb.getText());
            tapchi.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            tapchi.setSoPhatHanh(jTextFieldthu3.getText());
            tapchi.setThangPhatHanh(Integer.parseInt(jTextFieldthu4.getText()));
            
            quanLyThuVien.addTapChi(tapchi);
            new Main("TC000").setVisible(true);
            this.dispose();
        }
        if (radiobao.isSelected()) 
        {
            Bao bao = new Bao();
            bao.setTenNhaXB(jTextFieldtenxnb.getText());
            bao.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            bao.setNgayphathanh(jTextFieldthu3.getText());
            
            quanLyThuVien.addBao(bao);
            new Main("BA000").setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelText3;
    private javax.swing.JLabel jLabelText4;
    private javax.swing.JTextField jTextFieldsoban;
    private javax.swing.JTextField jTextFieldtenxnb;
    private javax.swing.JTextField jTextFieldthu3;
    private javax.swing.JTextField jTextFieldthu4;
    private javax.swing.ButtonGroup nhomloai;
    private javax.swing.JRadioButton radiobao;
    private javax.swing.JRadioButton radiosach;
    private javax.swing.JRadioButton radiotapchi;
    // End of variables declaration//GEN-END:variables
}
