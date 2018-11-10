
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DataList {
    static  Connection con = SqlDbConnection.getConnection();
    public static List<Student> getStudentList(){
    List<Student> list = new ArrayList<>();
    String sql = "select * from students";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            
        } catch (Exception e) {
            
        }
        return list;
    }
    
    
}
