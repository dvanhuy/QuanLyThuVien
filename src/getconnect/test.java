
package getconnect;

import dinhdang.Bao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
//    test()
//    {
//        Connection connection = ConnectSQLserver.getConnection();
//
//        try{
//            String sql = "SELECT id,tenNXB,soBanPhatHanh,tenTacGia ,soTrang FROM TaiLieu WHERE loai=? and id=?";
//            System.out.println("Ket noi dc");
//            PreparedStatement pstmt = connection.prepareStatement(sql);
//            pstmt.setString(1, "sach");
//            pstmt.setString(2, "SA001");
//            ResultSet rs = pstmt.executeQuery();
//            rs.next();
////            if (rs.getString(1)== null) System.out.println("huy");
//            System.out.printf("%6s  ",rs.getString(1)); 
//        }
//        catch(Exception e)
//        {
//            System.out.println("Ket noi loi");
//            System.out.println(e);
//        }
//    }
    public static void main(String[] args) {
//        test tetst = new test();
        Bao bao= new Bao();
        Connection connect = ConnectSQLserver.getConnection();
        
        try {
            String sql=  "select id,tenNXB,soBanPhatHanh,tenTacGia ,soTrang\n" +
                                "from TaiLieu\n" +
                                "where id=?\n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,"BA001");
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getDate(4));
            
        }
        catch(SQLException e)
        {
            System.out.println("tim bao theo id(luc setdata) khong thay");
        }      
    }
}
