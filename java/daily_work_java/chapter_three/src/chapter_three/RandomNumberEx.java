/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

/**
 *
 * @author User
 */
public class RandomNumberEx {
     public static void main(String[] args) {
        int singleDigitNumber = (int) (Math.random() * 10);
           System.out.println("Single Digit Number : " + singleDigitNumber);
        int twoDigitNumber = (int) (Math.random() * 100);
        if (twoDigitNumber > 9){
           System.out.println("Single Digit Number : " + twoDigitNumber);
        }else{
           System.out.println("Single Digit Number : " + twoDigitNumber+9); 
        }
         int threeDigitNumber = (int) (Math.random() * 1000);
           System.out.println("Single Digit Number : " + threeDigitNumber);
           System.out.println("50 and 99 : " + Math.round((50 + (Math.random() * 50))));
    }
}
