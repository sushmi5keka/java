
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateProductTable {
    
    private static Connection conn = ConnectionForDb.getConnection();
    
    public static void productTable(){
    
        String sql ="create table product(pro_id int(5) auto_increment primary key,"
                + "pro_name varchar(20),quntity int(9),unit_price double,total_price double,"
                + "purchase_date date,cat_id int(5),"
                + "foreign key (cat_id) references Category(cat_id))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("....create product table....");
        } catch (SQLException ex) {
            Logger.getLogger(CreateProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
