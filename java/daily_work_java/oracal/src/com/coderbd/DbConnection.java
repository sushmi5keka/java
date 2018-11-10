package com.coderbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String Host ="jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection ;
    private static String url = Host + ":" + PORT + ":" ;
    static Connection getConnection(String dbname,String dbUserName, String dbPassword){
    try{
   connection = DriverManager.getConnection(url + dbname,dbUserName, dbPassword);
        System.out.println("---conneted---");
    }catch (SQLException ex){
       ex.printStackTrace();
    }
    return connection;
    }

   

    
}
