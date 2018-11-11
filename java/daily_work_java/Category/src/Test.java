
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        //ConnectionForDb.getConnection();
        //CreateCategoryTable.CategoryTable();
        // Category cat = new Category();
        // cat.setId(4);
        // cat.setName("mobile");
        // InsertCatagoryTable.insertCategoryData(cat);
        // CreateProductTable.productTable();
        Proudct pro = new Proudct();
        pro.setName("Mi");
        pro.setQuintity(10);
        pro.setUnitPrice(2500);
        pro.setTotalPrice(25000);
        Date d = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-12");
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        pro.setPurchaseDate(d);
        Category category = new Category();
        category.setId(1);
        pro.setCategory(category);
        InsertProductTable.insertProductData(pro);
    }
}
