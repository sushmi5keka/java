package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlConnection {

    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "accounts";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection con = null;
    
    public static Connection getcConnection(){
        
        try {
            con = DriverManager.getConnection(URL,"root" , "1234");
                    } catch (SQLException ex) {
            Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("...Connected...");
        return null;
    
    }

}
