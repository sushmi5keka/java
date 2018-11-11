
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InsertProductTable {
    
    private static Connection conn = ConnectionForDb.getConnection();
    
    public static void insertProductData(Proudct p){
        String sql="insert into product(pro_name,quntity,unit_price,total_price,purchase_date,cat_id) values(?,?,?,?,?,?)";
    
         
        try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setString(1, p.getName());
           ps.setInt(2, p.getQuintity());
           ps.setInt(3, p.getUnitPrice());
           ps.setInt(4, p.getTotalPrice());
           ps.setDate(5, new java.sql.Date(p.getPurchaseDate().getTime()));
           ps.setInt(6, p.getCategory().getId());
           ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(InsertProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
