
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateTable {
    
    private static Connection conn = SqlDbConnection.getConnection();
    
    public static void table(){
    
        String sql = "create table students(id int(2),name varchar(15),email varchar(10))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                    System.out.println("...Table Created...");
                    } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
