
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateCategoryTable {
    
    private static Connection conn = ConnectionForDb.getConnection();
    
    public static void CategoryTable(){
    
        String sql ="create table Category(cat_id int(5) primary key,name varchar(30))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("....table created....");
        } catch (SQLException ex) {
            Logger.getLogger(CreateCategoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
