/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sum2 {

    

    public static void main(String[] args) {
       
     Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int fn = sc.nextInt();
        System.out.println("enter number");
        int ln = sc.nextInt();
        System.out.println("result : " + (makeSum(ln, ln)));
    }

    public static int makeSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i >= n2; i--){
                sum+=i;
                }

            } else if (n1 < n2) {
                for (int i = n2; i <= n1; i++){
                sum+=i;
                }

            } else if (n1 == n2) {
                sum = n1;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}


