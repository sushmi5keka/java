
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlDbConnection {

    private static final String Host = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "StudentData";
    private static final String URL = Host + "/" + DBNAME;
    private static Connection con = null;
    
    public static Connection getConnection(){
    
        try {
            con = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("...connected...");
        } catch (SQLException ex) {
            Logger.getLogger(SqlDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    }

}
