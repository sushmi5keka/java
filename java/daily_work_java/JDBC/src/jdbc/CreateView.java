/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateView {
    
     private static Connection conn = MySqlDbConnection.getConnection();
    
    public static ResultSet getDataById(int id){
   String sql = "select * from hobby where id=?";
    ResultSet rs = null;
      try {
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setInt(1, id);
         rs = ps.executeQuery();
         
      } catch (SQLException ex) {
          Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
      }
       return rs;
   }
}
