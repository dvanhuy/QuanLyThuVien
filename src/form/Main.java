
package form;

import dinhdang.Bao;
import dinhdang.Sach;
import dinhdang.TapChi;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlythuvien.QuanLyThuVien;

public class Main extends javax.swing.JFrame {

    QuanLyThuVien controlall;
    DefaultTableModel defaultTableModel;
    
    public void resetTableSachdata(){
        controlall = new QuanLyThuVien();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }    
        };
        tabledata.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Tên NXB");
        defaultTableModel.addColumn("Số bản p/h");
        defaultTableModel.addColumn("Tên tác giả");
        defaultTableModel.addColumn("Số trang");
        List<Sach> sach=controlall.getALLSach();
        
        for (Sach i:sach)
        {
            defaultTableModel.addRow(new Object[]{i.getId(),i.getTenNhaXB(),i.getSoBanPhatHanh()
                    ,i.getTenTGia(),i.getSoTrang()});
        } 
    }
    
    public void resetTableTapChidata(){
        controlall = new QuanLyThuVien();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }    
        };
        tabledata.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Tên NXB");
        defaultTableModel.addColumn("Số bản p/h");
        defaultTableModel.addColumn("Số phát hành");
        defaultTableModel.addColumn("Tháng phát hành");
    
        List<TapChi> tapchi=controlall.getALLTapChi();
        
        for (TapChi i:tapchi)
        {
            defaultTableModel.addRow(new Object[]{i.getId(),i.getTenNhaXB(),i.getSoBanPhatHanh()
                    ,i.getSoPhatHanh(),i.getThangPhatHanh()});
        }
    }
    
    public void resetTableBaodata(){
        controlall = new QuanLyThuVien();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }    
        };
        tabledata.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Tên NXB");
        defaultTableModel.addColumn("Số bản p/h");
        defaultTableModel.addColumn("Ngày Phát Hành");
    
        List<Bao> bao=controlall.getALLBao();
        
        for (Bao i:bao)
        {
            defaultTableModel.addRow(new Object[]{i.getId(),i.getTenNhaXB(),i.getSoBanPhatHanh()
                    ,i.getNgayphathanh()});
        } 
    }
    
    public Main() {
        initComponents();
        resetTableSachdata();
    }
    public Main(String x) {
        initComponents();
        if (x.length()>4)
        {
            if (x.substring(0,2).equals("SA")) 
            {
                resetTableSachdata();
            }
            if (x.substring(0,2).equals("TC"))
            {
                resetTableTapChidata();
            }
            if (x.substring(0,2).equals("BA"))
            {
               resetTableBaodata();
            } 
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SachList = new javax.swing.JButton();
        TapChiList = new javax.swing.JButton();
        BaoList = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ButtonThem = new javax.swing.JButton();
        ButtonXoa = new javax.swing.JButton();
        ButtonSua = new javax.swing.JButton();
        ButtonTim = new javax.swing.JButton();
        ButtonThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện");

        tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabledata);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý thư viện");

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 30, 20));

        SachList.setBackground(new java.awt.Color(204, 255, 51));
        SachList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SachList.setForeground(new java.awt.Color(255, 255, 255));
        SachList.setText("Sách");
        SachList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SachListActionPerformed(evt);
            }
        });
        jPanel1.add(SachList);

        TapChiList.setBackground(new java.awt.Color(255, 153, 153));
        TapChiList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TapChiList.setForeground(new java.awt.Color(255, 255, 255));
        TapChiList.setText("Tạp chí");
        TapChiList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TapChiListActionPerformed(evt);
            }
        });
        jPanel1.add(TapChiList);

        BaoList.setBackground(new java.awt.Color(153, 204, 255));
        BaoList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BaoList.setForeground(new java.awt.Color(255, 255, 255));
        BaoList.setText("Báo");
        BaoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaoListActionPerformed(evt);
            }
        });
        jPanel1.add(BaoList);

        jPanel2.setLayout(new java.awt.GridLayout(1, 5, 20, 20));

        ButtonThem.setBackground(new java.awt.Color(51, 255, 51));
        ButtonThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonThem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonThem.setText("Thêm");
        ButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonThem);

        ButtonXoa.setBackground(new java.awt.Color(255, 51, 51));
        ButtonXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        ButtonXoa.setText("Xóa");
        ButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXoaActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonXoa);

        ButtonSua.setBackground(new java.awt.Color(51, 51, 255));
        ButtonSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSua.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSua.setText("Sửa");
        ButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSuaActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSua);

        ButtonTim.setBackground(new java.awt.Color(255, 102, 255));
        ButtonTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonTim.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTim.setText("Tìm");
        ButtonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonTim);

        ButtonThoat.setBackground(new java.awt.Color(102, 102, 102));
        ButtonThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonThoat.setForeground(new java.awt.Color(255, 255, 255));
        ButtonThoat.setText("Thoát");
        ButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThoatActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonThoat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TapChiListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TapChiListActionPerformed
        resetTableTapChidata();
    }//GEN-LAST:event_TapChiListActionPerformed

    private void SachListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SachListActionPerformed
        resetTableSachdata();
    }//GEN-LAST:event_SachListActionPerformed

    private void BaoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaoListActionPerformed
        resetTableBaodata();
    }//GEN-LAST:event_BaoListActionPerformed

    private void ButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemActionPerformed
        new Add().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonThemActionPerformed

    private void ButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXoaActionPerformed
        int row = tabledata.getSelectedRow();
        String id="";
        if (row == -1) {
            String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần xóa");
            if (x==null) System.out.print("");
            else {
                id=x;
                controlall.deteleTaiLieu(x); 
            }  
        }
        else 
        {
            id+=String.valueOf(tabledata.getValueAt (row, 0));
            int confirm = JOptionPane.showConfirmDialog(this, "Ban chac chan muon xoa khong?");
            if (confirm == JOptionPane. YES_OPTION) 
            {
                String userId =String.valueOf(tabledata.getValueAt (row, 0));
                controlall.deteleTaiLieu(userId);
            }
        } 
//        defaultTableModel.setRowCount(0);
        if (id.length()>4) {
             if (id.substring(0,2).equals("SA")) resetTableSachdata();
            else if (id.substring(0,2).equals("TC")) resetTableTapChidata();
            else if (id.substring(0,2).equals("BA")) resetTableBaodata();
            else resetTableSachdata();
        }
    }//GEN-LAST:event_ButtonXoaActionPerformed

    private void ButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonThoatActionPerformed

    private void ButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSuaActionPerformed
        int row = tabledata.getSelectedRow();
        if (row == -1) {
            String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần sửa");
            if (x==null) System.out.print("");
            else if (controlall.searchTaiLieu(x)==null)
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã "+x+" trong danh sách", "Sửa", JOptionPane.INFORMATION_MESSAGE);
            }
            else 
            {
                new Update(x).setVisible(true);
                this.dispose();
            }       
        }
        else 
        {
            String userId =String.valueOf(tabledata.getValueAt (row, 0));
            new Update(userId).setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_ButtonSuaActionPerformed

    private void ButtonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimActionPerformed
        String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần tìm");
        if (x==null) System.out.print("");
        else if (controlall.searchTaiLieu(x)==null)
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã "+x+" trong danh sách", "Tìm", JOptionPane.INFORMATION_MESSAGE);
        }
        else 
        {
            new Search(controlall.searchTaiLieu(x)).setVisible(true);
            this.dispose();
        }
      
    }//GEN-LAST:event_ButtonTimActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaoList;
    private javax.swing.JButton ButtonSua;
    private javax.swing.JButton ButtonThem;
    private javax.swing.JButton ButtonThoat;
    private javax.swing.JButton ButtonTim;
    private javax.swing.JButton ButtonXoa;
    private javax.swing.JButton SachList;
    private javax.swing.JButton TapChiList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabledata;
    // End of variables declaration//GEN-END:variables

}
