
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InsertCatagoryTable {
    
    private static Connection conn = ConnectionForDb.getConnection();
    
    public  static void insertCategoryData(Category c){
    
        String sql = "insert into Category(cat_id,name) values(?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,c.getId());
            ps.setString(2,c.getName());
            ps.executeUpdate();
            System.out.println("....data inserted into category table....");
        } catch (SQLException ex) {
            Logger.getLogger(InsertCatagoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
