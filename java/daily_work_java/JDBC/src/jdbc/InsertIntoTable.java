
package jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoTable {
    
  private static Connection conn = MySqlDbConnection.getConnection();
  
  public static void insertData(){
  String sql = "insert into study(id,course) value(3,'MBA')";
  
      
      try {
          PreparedStatement pss = conn.prepareStatement(sql);
          pss.executeUpdate();
          System.out.println("data inserted");
      } catch (SQLException ex) {
          Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
   public static void insertData2(int i,String n){
  String sql = "insert into hobby(id,name) value(?,?)";
  
      
      try {
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, i);
          ps.setString(2, n);
          ps.executeUpdate();
          System.out.println("data inserted");
      } catch (SQLException ex) {
          Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
   
   

    
}
