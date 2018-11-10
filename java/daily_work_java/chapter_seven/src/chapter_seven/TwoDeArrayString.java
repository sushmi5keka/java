/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_seven;

/**
 *
 * @author User
 */
public class TwoDeArrayString {
    public static void main(String[] args) {
          String twoDe[][] ={
            {"a","b","c","d"},
            {"e","f"},
            {"g","h","i"}
        };
        for (String oneDe[] : twoDe){
            for (String i : oneDe){
                System.out.print(i + " ");
            }
         
        System.out.println();
          
        }
         System.out.println("twoD [][] : " + twoDe[1][1]);
         System.out.println("twoD [][] : " + twoDe[2][0]);
         System.out.println();
    }
    
}
