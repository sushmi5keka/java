
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListProductData {
    private static Connection conn = MysqlConnection.getConnection();
    
    public  static List<Product> getProductList(){
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
               Category c = new Category();
               c.setId(rs.getInt(7));
                list.add(new Product(rs.getInt(1), rs.getString(2),rs.getInt(3) ,rs.getDouble(4), rs.getDouble(5), rs.getDate(6), c));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListProductData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
        
    
    }
}
