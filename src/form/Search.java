
package form;

import dinhdang.TaiLieu;
import quanlythuvien.QuanLyThuVien;

public class Search extends javax.swing.JFrame {

    QuanLyThuVien controlall;
    
    public Search(TaiLieu tailieu) {
        initComponents();
        controlall= new QuanLyThuVien();
        jTextFieldid.setText(tailieu.getId());
        jTextFieldtennxb.setText(tailieu.getTenNhaXB());
        jTextFieldsoban.setText(String.valueOf(tailieu.getSoBanPhatHanh()));
        String tpye= tailieu.getId().substring(0, 2);
        
        if (tpye.equals("TC")) 
            radiotapchi.setSelected(true);
        else if (tpye.equals("BA"))
            radiobao.setSelected(true);
//        radiosach.setEnabled(false);
//        radiotapchi.setEnabled(false);
//        radiobao.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loaiGroup = new javax.swing.ButtonGroup();
        buttondong = new javax.swing.JButton();
        radiotapchi = new javax.swing.JRadioButton();
        radiobao = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldtennxb = new javax.swing.JTextField();
        jLabelText3 = new javax.swing.JLabel();
        jTextFieldsoban = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radiosach = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tìm");

        buttondong.setBackground(new java.awt.Color(102, 255, 102));
        buttondong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttondong.setForeground(new java.awt.Color(255, 255, 255));
        buttondong.setText("Đóng");
        buttondong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondongActionPerformed(evt);
            }
        });

        radiotapchi.setBackground(new java.awt.Color(255, 255, 255));
        loaiGroup.add(radiotapchi);
        radiotapchi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiotapchi.setText("Tạp chí");
        radiotapchi.setEnabled(false);
        radiotapchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiotapchiActionPerformed(evt);
            }
        });

        radiobao.setBackground(new java.awt.Color(255, 255, 255));
        loaiGroup.add(radiobao);
        radiobao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiobao.setText("Báo");
        radiobao.setEnabled(false);
        radiobao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên NXB");

        jTextFieldtennxb.setEditable(false);
        jTextFieldtennxb.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldtennxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtennxbActionPerformed(evt);
            }
        });

        jLabelText3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelText3.setText("Số bản");

        jTextFieldsoban.setEditable(false);
        jTextFieldsoban.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Loại");

        radiosach.setBackground(new java.awt.Color(255, 255, 255));
        loaiGroup.add(radiosach);
        radiosach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiosach.setSelected(true);
        radiosach.setText("Sách");
        radiosach.setEnabled(false);
        radiosach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabelText3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldid)
                            .addComponent(jTextFieldtennxb)
                            .addComponent(jTextFieldsoban)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radiosach)
                                        .addGap(18, 18, 18)
                                        .addComponent(radiotapchi)))
                                .addGap(18, 18, 18)
                                .addComponent(radiobao))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(buttondong, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiosach)
                    .addComponent(radiotapchi)
                    .addComponent(radiobao)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldtennxb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelText3)
                    .addComponent(jTextFieldsoban, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(buttondong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttondongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondongActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttondongActionPerformed

    private void radiotapchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiotapchiActionPerformed

    }//GEN-LAST:event_radiotapchiActionPerformed

    private void radiobaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobaoActionPerformed

    }//GEN-LAST:event_radiobaoActionPerformed

    private void radiosachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiosachActionPerformed

    }//GEN-LAST:event_radiosachActionPerformed

    private void jTextFieldtennxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtennxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtennxbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelText3;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldsoban;
    private javax.swing.JTextField jTextFieldtennxb;
    private javax.swing.ButtonGroup loaiGroup;
    private javax.swing.JRadioButton radiobao;
    private javax.swing.JRadioButton radiosach;
    private javax.swing.JRadioButton radiotapchi;
    // End of variables declaration//GEN-END:variables

}
