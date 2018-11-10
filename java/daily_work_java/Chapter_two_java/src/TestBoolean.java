
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestBoolean {
   static int obtainMark;
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Obtained Number : ");
       obtainMark = sc.nextInt();
       if (obtainMark >= 70 && obtainMark < 80) {
           System.out.println("Gread A");
           
       } else if (obtainMark >= 80 && obtainMark <= 100) {
           System.out.println("Gread A+");
           
       } else if (obtainMark >= 0 && obtainMark < 70) {
           System.out.println("Gread F");
        
       } else {
           System.out.println("Invalide Number");
       }
       
   }
}
   

