package com.coderbd.evedence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Util {
  
    public static void WriteToFile(String filename, List<Student> students) throws Exception {
        File dataFile = new File(filename + ".txt");
        try {
            if (dataFile.exists() == false) {
                System.out.println("we need a file...");
                dataFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(dataFile, true));
            for (Student s : students) {
                out.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", "
                        + s.getGender() + ", " + s.getPassword() + ", " + s.getHobby()
                        + ", " + s.getRound() + ", " + s.getNote() + "\n");
            }
            out.close();
            
        } catch (IOException e) {
            System.out.println("could not log...");
        }
        
    }
    
    public static void displayStudentDataFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            
            while((line = reader.readLine()) != null ){
            model.addRow(line.split(", "));
            }
            reader.close();
        
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffer reader issu...");
        }
    }

  

    

   
}

