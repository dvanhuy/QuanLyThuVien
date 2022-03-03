
package quanlythuvien;

import dinhdang.Bao;
import dinhdang.Sach;
import dinhdang.TaiLieu;
import dinhdang.TapChi;
import getconnect.ConnectSQLserver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyThuVien {

    public List<Sach> getALLSach(){
        List<Sach> sachALL = new ArrayList<>();
        Connection connect = ConnectSQLserver.getConnection();
        try {
            
            String sql = "SELECT id,tenNXB,soBanPhatHanh,tenTacGia ,soTrang FROM TaiLieu WHERE loai=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, "sach");
            ResultSet rs = pstmt.executeQuery();
            while( rs.next()) {
                Sach sach = new Sach();
                
                sach.setId(rs.getString(1));// tên cột
                sach.setTenNhaXB(rs.getString(2));
                sach.setSoBanPhatHanh(rs.getInt(3));
                sach.setTenTGia(rs.getString(4));
                sach.setSoTrang(rs.getInt(5));
                
                sachALL.add(sach);
            }
            return sachALL;
        } catch(SQLException e){
            System.out.println("lay du lieu sach loi");
        }
        return null;
    }
    
    public List<TapChi> getALLTapChi(){
        List<TapChi> tapchiALL = new ArrayList<>();
        Connection connect = ConnectSQLserver.getConnection();
        try {
            
            String sql = "SELECT id,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh FROM TaiLieu WHERE loai=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, "tapchi");
            ResultSet rs = pstmt.executeQuery();
            while( rs.next()) {
                TapChi tapchi = new TapChi();
                
                tapchi.setId(rs.getString(1));// tên cột
                tapchi.setTenNhaXB(rs.getString(2));
                tapchi.setSoBanPhatHanh(rs.getInt(3));
                tapchi.setSoPhatHanh(rs.getString(4));
                tapchi.setThangPhatHanh(rs.getInt(5));
                
                tapchiALL.add(tapchi);
            }
            return tapchiALL;
        } catch(SQLException e){
            System.out.println("lay du lieu tap chi loi");
        }
        return null;
    }
    
    public List<Bao> getALLBao(){
        List<Bao> baoALL = new ArrayList<>();
        Connection connect = ConnectSQLserver.getConnection();
        try {
            
            String sql = "SELECT id,tenNXB,soBanPhatHanh,ngayPhatHanh FROM TaiLieu WHERE loai=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, "bao");
            ResultSet rs = pstmt.executeQuery();
            while( rs.next()) {
                Bao bao = new Bao();
                
                bao.setId(rs.getString(1));// tên cột
                bao.setTenNhaXB(rs.getString(2));
                bao.setSoBanPhatHanh(rs.getInt(3));
                bao.setNgayphathanh(rs.getString(4));
                
                baoALL.add(bao);
            }
            return baoALL;
        } catch(SQLException e){
            System.out.println("lay du lieu bao loi");
        }
        return null;
    }
    
    public String getIdNext(String x)
    {
        String truoc=x.substring(0, 2);
        String sau=x.substring(2, 5);
        int cong = Integer.parseInt(sau)+1;
        sau=String.valueOf(cong);
        if (sau.length() == 1)
                sau="00".concat(sau);
        else if (sau.length() == 2)
            sau="0".concat(sau);
        truoc=truoc.concat(sau);
        return truoc;
    }
    
    public void addSach(Sach sach)
    {
        Connection connect = ConnectSQLserver.getConnection();
        
        String idnext="";
        try {
            String sqllastiid=  "select top 1 id \n" +
                                "from TaiLieu\n" +
                                "where loai=?\n" +
                                "order by id desc ";
            PreparedStatement lastid = connect.prepareStatement(sqllastiid);
            lastid.setString(1,"sach");
            ResultSet rslastid = lastid.executeQuery();
            rslastid.next();
            idnext+=rslastid.getString(1);
        }
        catch(SQLException e)
        {
            System.out.println("loi tai lay last id");
        }
        String getidnext=getIdNext(idnext);
        
        try {
            
            String sql = "insert into TaiLieu(id,tenNXB,soBanPhatHanh,tenTacGia,soTrang,loai) "
                    + "values (?,?,?,?,?,?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,getidnext);
            pstmt.setString(2,sach.getTenNhaXB());
            pstmt.setInt(3,sach.getSoBanPhatHanh());
            pstmt.setString(4,sach.getTenTGia());
            pstmt.setInt(5,sach.getSoTrang());
            pstmt.setString(6,"sach");
            pstmt.execute();
            
        } catch(SQLException e){
            System.out.println("them sach vao loi");
        }
    }
    
    public void addTapChi(TapChi tapchi)
    {
        Connection connect = ConnectSQLserver.getConnection();
        
        String idnext="";
        try {
            String sqllastiid=  "select top 1 id \n" +
                                "from TaiLieu\n" +
                                "where loai=?\n" +
                                "order by id desc ";
            PreparedStatement lastid = connect.prepareStatement(sqllastiid);
            lastid.setString(1,"tapchi");
            ResultSet rslastid = lastid.executeQuery();
            rslastid.next();
            idnext+=rslastid.getString(1);
        }
        catch(SQLException e)
        {
            System.out.println("loi tai lay last id");
        }
        String getidnext=getIdNext(idnext);
        
        try {
            
            String sql = "insert into TaiLieu(id,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh,loai) "
                    + "values (?,?,?,?,?,?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,getidnext);
            pstmt.setString(2,tapchi.getTenNhaXB());
            pstmt.setInt(3,tapchi.getSoBanPhatHanh());
            pstmt.setString(4,tapchi.getSoPhatHanh());
            pstmt.setInt(5,tapchi.getThangPhatHanh());
            pstmt.setString(6,"tapchi");
            pstmt.execute();
            
        } catch(SQLException e){
            System.out.println("them tap chi vao loi");
        }
    }
    
    public void addBao(Bao bao)
    {
        Connection connect = ConnectSQLserver.getConnection();
        
        String idnext="";
        try {
            String sqllastiid=  "select top 1 id \n" +
                                "from TaiLieu\n" +
                                "where loai=?\n" +
                                "order by id desc ";
            PreparedStatement lastid = connect.prepareStatement(sqllastiid);
            lastid.setString(1,"bao");
            ResultSet rslastid = lastid.executeQuery();
            rslastid.next();
            idnext+=rslastid.getString(1);
        }
        catch(SQLException e)
        {
            System.out.println("loi tai lay last id");
        }
        String getidnext=getIdNext(idnext);
        
        try {
            
            String sql = "insert into TaiLieu(id,tenNXB,soBanPhatHanh,ngayPhatHanh,loai) "
                    + "values (?,?,?,?,?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,getidnext);
            pstmt.setString(2,bao.getTenNhaXB());
            pstmt.setInt(3,bao.getSoBanPhatHanh());
            pstmt.setString(4,bao.getNgayphathanh());
            pstmt.setString(5,"bao");
            pstmt.execute();
            
        } catch(SQLException e){
            System.out.println("them bao vao loi");
        }
    }
    
    public void deteleTaiLieu(String id)
    {
        Connection connection = ConnectSQLserver.getConnection();
        String sql = "delete TaiLieu "
                + "where ID=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);        
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("ham xoa loi");
        }
    }
    
    public TaiLieu searchTaiLieu(String id)
    {
        TaiLieu tailieu= new TaiLieu();
        Connection connect = ConnectSQLserver.getConnection();
        
        try {
            String sql=  "select id,tenNXB,soBanPhatHanh\n" +
                                "from TaiLieu\n" +
                                "where id=?\n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            tailieu.setId(rs.getString(1));
            tailieu.setTenNhaXB(rs.getString(2));
            tailieu.setSoBanPhatHanh(rs.getInt(3));
            
            return tailieu;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim sach theo id khong thay");
            return null;
        }      
    }
    
    public Sach getdataSach(String sachid)
    {
        Sach sach= new Sach();
        Connection connect = ConnectSQLserver.getConnection();
        
        try {
            String sql=  "select id,tenNXB,soBanPhatHanh,tenTacGia ,soTrang\n" +
                                "from TaiLieu\n" +
                                "where id=?\n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,sachid);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            sach.setId(rs.getString(1));
            sach.setTenNhaXB(rs.getString(2));
            sach.setSoBanPhatHanh(rs.getInt(3));
            sach.setTenTGia(rs.getString(4));
            sach.setSoTrang(rs.getInt(5));
            
            return sach;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim sach theo id(luc setdata) khong thay");
            return null;
        }      
    }
    
    public TapChi getdataTapChi(String tapchiid)
    {
        TapChi tapchi= new TapChi();
        Connection connect = ConnectSQLserver.getConnection();
        
        try {
            String sql=  "select id,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh\n" +
                                "from TaiLieu\n" +
                                "where id=?\n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,tapchiid);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            tapchi.setId(rs.getString(1));
            tapchi.setTenNhaXB(rs.getString(2));
            tapchi.setSoBanPhatHanh(rs.getInt(3));
            tapchi.setSoPhatHanh(rs.getString(4));
            tapchi.setThangPhatHanh(rs.getInt(5));
            
            return tapchi;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim tai lieu theo id (luc setdata)khong thay");
            return null;
        }      
    }
    
    public Bao getdataBao(String baoid)
    {
        Bao bao= new Bao();
        Connection connect = ConnectSQLserver.getConnection();
        
        try {
            String sql=  "select id,tenNXB,soBanPhatHanh,ngayPhatHanh\n" +
                                "from TaiLieu\n" +
                                "where id=?\n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,baoid);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            bao.setId(rs.getString(1));
            bao.setTenNhaXB(rs.getString(2));
            bao.setSoBanPhatHanh(rs.getInt(3));
            bao.setNgayphathanh(rs.getString(4));
            return bao;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim bao theo id(luc setdata) khong thay");
            return null;
        }      
    }
    
    public void updateDataSach(Sach sach)
    {
        Connection connect = ConnectSQLserver.getConnection();
        try {
            String sql=  "UPDATE TaiLieu "
                    + "SET tenNXB=?,soBanPhatHanh=?,tenTacGia=? ,soTrang=? "
                    + "WHERE id=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            pstmt.setString(1, sach.getTenNhaXB());
            pstmt.setInt(2, sach.getSoBanPhatHanh());
            pstmt.setString(3, sach.getTenTGia());
            pstmt.setInt(4, sach.getSoTrang());
            pstmt.setString(5, sach.getId());
            
            pstmt.execute();
        }
        catch(SQLException e)
        {
            System.out.println("Lỗi lúc cập nhật dữ liệu sách lên");
        }      
    }
    
    public void updateDataTapChi(TapChi tapchi)
    {
        Connection connect = ConnectSQLserver.getConnection();
        try {
            String sql=  "UPDATE TaiLieu "
                    + "SET tenNXB=?,soBanPhatHanh=?,soPhatHanh=?,thangPhatHanh=? "
                    + "WHERE id=? ";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            pstmt.setString(1, tapchi.getTenNhaXB());
            pstmt.setInt(2, tapchi.getSoBanPhatHanh());
            pstmt.setString(3, tapchi.getSoPhatHanh());
            pstmt.setInt(4, tapchi.getThangPhatHanh());
            pstmt.setString(5, tapchi.getId());
            
            pstmt.execute();
        }
        catch(SQLException e)
        {
            System.out.println("Lỗi lúc cập nhật dữ liệu tạp chí lên");
        }      
    }
    
    public void updateDataBao(Bao bao)
    {
        Connection connect = ConnectSQLserver.getConnection();
        try {
            String sql=  "UPDATE TaiLieu "
                    + "SET tenNXB=?,soBanPhatHanh=?,ngayPhatHanh=? "
                    + "WHERE id=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            pstmt.setString(1, bao.getTenNhaXB());
            pstmt.setInt(2, bao.getSoBanPhatHanh());
            pstmt.setString(3, bao.getNgayphathanh());
            pstmt.setString(4, bao.getId());
            
            pstmt.execute();
        }
        catch(SQLException e)
        {
            System.out.println("Lỗi lúc cập nhật dữ liệu báo lên");
        }      
    }
    
}
