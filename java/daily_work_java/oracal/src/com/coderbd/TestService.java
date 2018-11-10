
package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestService {
    static Connection conn = DbConnection.getConnection("xe","hr","hr");
    
    public static void getEmployeeList() {
        try{
        PreparedStatement ps = conn.prepareStatement("select * from employees");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("" + rs.getString(1) + " " + rs.getString(2));
        }
        
        }catch (SQLException ex){
        ex.printStackTrace();
        }
        
    }
    
    public static void updateEmployee(){
        try{
        PreparedStatement ps = conn.prepareStatement("update employees set frist_name= 'Bangladesh' where employee_id=100");
        int i =ps.executeUpdate();
        System.out.println(i + " data has been updated");
        }catch (SQLException ex){   
        Logger.getLogger(TestService.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
     public static void deleteEmployee(){
        try{
        PreparedStatement ps = conn.prepareStatement("delete from employees  "
                + "where employee_id=206");
        int i = ps.executeUpdate();
        System.out.println(i + " data has been deleted");
        }catch (SQLException ex){
        Logger.getLogger(TestService.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
