/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteTable {
    
     private static Connection conn = MySqlDbConnection.getConnection();
     
      public static void deleteData(){
  String sql = "delete from hobby where id=1";
  
      
      try {
          PreparedStatement pss = conn.prepareStatement(sql);
          pss.executeUpdate();
          System.out.println("data deleted...");
      } catch (SQLException ex) {
          Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    
}