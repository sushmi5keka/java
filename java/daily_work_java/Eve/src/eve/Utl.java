
package eve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;

public class Utl {
    
    public static void writeToFile(String filename, List<Stu>stud) throws Exception{
    File dFile = new File(filename+".txt");
    
        try {
            if(dFile.exists() == false){
                System.out.println("we need a file");
                dFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(dFile, true));
            for(Stu s : stud){
            out.append(s.getId()+ " , " + s.getName() + " , " + s.getAge() + " , " + s.getGender() +
                    " , " +s.getRound() +" , "+s.getHobby() + s.getEmail()+ " , "+s.getPassword() +
                    " , " + s.getNote()+"\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("could not log...");
        }
    
    }
    
    public static void displayDataFromFile(String filename,DefaultTableModel model){
    String line;
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            while((line=reader.readLine()) != null){
            model.addRow(line.split(" , "));
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("buffer reader isssue...");
        }
    }
    
}
