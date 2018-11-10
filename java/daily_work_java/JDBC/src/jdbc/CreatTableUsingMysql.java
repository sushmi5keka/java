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

/**
 *
 * @author User
 */
public class CreatTableUsingMysql {

    private static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table hobby(id int(11),name varchar(30))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created...");
        } catch (SQLException ex) {
            Logger.getLogger(CreatTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
