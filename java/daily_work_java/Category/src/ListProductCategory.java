
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListProductCategory {
    static Connection conn = ConnectionForDb.getConnection();
    public static List<Proudct> getProductList(){
    List<Proudct> list= new ArrayList<>();
    String sql = "select * from product";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Category cat = new Category();
                cat.setId(rs.getInt(7));
            list.add(new Proudct(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),
            rs.getDate(6),cat));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public static List<Category> getCategoryList(){
    List<Category> list= new ArrayList<>();
    String sql = "select * from category";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            list.add(new Category(rs.getInt(1),rs.getString(2)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
