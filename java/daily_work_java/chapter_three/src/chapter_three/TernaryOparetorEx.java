
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
public class TernaryOparetorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println((num % 2 ==0) ? "Num is even" : "Num is odd");
    }
}
