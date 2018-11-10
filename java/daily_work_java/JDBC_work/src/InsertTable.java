
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class InsertTable {
    
   public static Connection conn = SqlDbConnection.getConnection();
    
    public  static void insert(Student s){
        
        String sql = "insert into students(id,name,email) values(?,?,?)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();
            System.out.println("...data inserted into table...");
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    static void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
