/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
        
        System.out.println(year + " is a leap year ? = " + isLeapYear);
    }
}
