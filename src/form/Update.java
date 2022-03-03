
package form;

import dinhdang.Bao;
import dinhdang.Sach;
import dinhdang.TapChi;
import quanlythuvien.QuanLyThuVien;

public class Update extends javax.swing.JFrame {

    QuanLyThuVien controlall;
    
    public Update(String tailieuid) {
        initComponents();
        controlall= new QuanLyThuVien();
        jTextFieldid.setEnabled(false);
        if (tailieuid.substring(0,2).equals("SA")) 
        {
            Sach sach= new Sach();
            sach=controlall.getdataSach(tailieuid);
            jTextFieldid.setText(sach.getId());
            jTextFieldtenxnb.setText(sach.getTenNhaXB());
            jTextFieldsoban.setText(String.valueOf(sach.getSoBanPhatHanh()));
            jTextFieldthu3.setText(sach.getTenTGia());
            jTextFieldthu4.setText(String.valueOf(sach.getSoTrang()));
        }
        if (tailieuid.substring(0,2).equals("TC"))
        {
            TapChi tapchi= new TapChi();
            tapchi=controlall.getdataTapChi(tailieuid);
            jTextFieldid.setText(tapchi.getId());
            jTextFieldtenxnb.setText(tapchi.getTenNhaXB());
            jTextFieldsoban.setText(String.valueOf(tapchi.getSoBanPhatHanh()));
            jLabelthu3.setText("Số p/h");
            jTextFieldthu3.setText(tapchi.getSoPhatHanh());
            jLabelthu4.setText("Tháng p/h");
            jTextFieldthu4.setText(String.valueOf(tapchi.getThangPhatHanh()));
        }
        if (tailieuid.substring(0,2).equals("BA"))
        {
            Bao bao= new Bao();
            bao=controlall.getdataBao(tailieuid);
            jTextFieldid.setText(bao.getId());
            jTextFieldtenxnb.setText(bao.getTenNhaXB());
            jTextFieldsoban.setText(String.valueOf(bao.getSoBanPhatHanh()));
            jLabelthu3.setText("Ngày p/h");
            jTextFieldthu3.setText(bao.getNgayphathanh());
            jLabelthu4.setText("------");
            jTextFieldthu4.setEnabled(false);
            
        }          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldtenxnb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldsoban = new javax.swing.JTextField();
        jLabelthu3 = new javax.swing.JLabel();
        jTextFieldthu3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelthu4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldthu4 = new javax.swing.JTextField();
        buttonsubmic = new javax.swing.JButton();
        jTextFieldid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sửa");

        jButtonback.setForeground(new java.awt.Color(255, 51, 51));
        jButtonback.setText("Back");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên NXB");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số bản p/h");

        jLabelthu3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelthu3.setText("Tên TG");

        jTextFieldthu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldthu3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sửa tài liệu");

        jLabelthu4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelthu4.setText("Số trang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        buttonsubmic.setBackground(new java.awt.Color(102, 255, 102));
        buttonsubmic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonsubmic.setForeground(new java.awt.Color(255, 255, 255));
        buttonsubmic.setText("Xác nhận");
        buttonsubmic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsubmicActionPerformed(evt);
            }
        });

        jTextFieldid.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonback)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabelthu3)
                    .addComponent(jLabelthu4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldtenxnb, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jTextFieldsoban)
                            .addComponent(jTextFieldthu3)
                            .addComponent(jTextFieldthu4)
                            .addComponent(jTextFieldid, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(buttonsubmic, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonback))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldtenxnb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldsoban, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelthu3)
                    .addComponent(jTextFieldthu3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelthu4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldthu4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(buttonsubmic, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void buttonsubmicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsubmicActionPerformed
        String tailieuid=jTextFieldid.getText();
        if (tailieuid.substring(0,2).equals("SA")) 
        {
            Sach sach= new Sach();
            sach.setId(tailieuid);
            sach.setTenNhaXB(jTextFieldtenxnb.getText());
            sach.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            sach.setTenTGia(jTextFieldthu3.getText());
            sach.setSoTrang(Integer.parseInt(jTextFieldthu4.getText()));
            controlall.updateDataSach(sach);
        }
        if (tailieuid.substring(0,2).equals("TC"))
        {
            TapChi tapchi= new TapChi();
            tapchi.setId(tailieuid);
            tapchi.setTenNhaXB(jTextFieldtenxnb.getText());
            tapchi.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            tapchi.setSoPhatHanh(jTextFieldthu3.getText());
            tapchi.setThangPhatHanh(Integer.parseInt(jTextFieldthu4.getText()));
            controlall.updateDataTapChi(tapchi);
        }
        if (tailieuid.substring(0,2).equals("BA"))
        {
            Bao bao= new Bao();
            bao.setId(tailieuid);
            bao.setTenNhaXB(jTextFieldtenxnb.getText());
            bao.setSoBanPhatHanh(Integer.parseInt(jTextFieldsoban.getText()));
            bao.setNgayphathanh(jTextFieldthu3.getText());
            controlall.updateDataBao(bao);
        } 
        new Main(tailieuid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonsubmicActionPerformed

    private void jTextFieldthu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldthu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldthu3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonsubmic;
    private javax.swing.JButton jButtonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelthu3;
    private javax.swing.JLabel jLabelthu4;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldsoban;
    private javax.swing.JTextField jTextFieldtenxnb;
    private javax.swing.JTextField jTextFieldthu3;
    private javax.swing.JTextField jTextFieldthu4;
    // End of variables declaration//GEN-END:variables
}
