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
public class SwitchStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an input : ");
        int status = sc.nextInt();
        switch (status){
           
                case 0 :
                System.out.println("000");
                break;
                case 1 :
                System.out.println("111");
                break;
                case 2 :
                System.out.println("222");
                break;
                case 3 :
                System.out.println("333");
                break;
                default :
                System.out.println("........default.........");
                System.exit(1);
        }
    }
}
