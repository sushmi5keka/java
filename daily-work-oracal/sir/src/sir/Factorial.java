/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sir;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Ayaz
 */
public class Factorial {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         getFactorials(sc.nextInt());
         
    }
     static void getFactorials(int n) {
         BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));// f= f * i
        }
        System.out.println(f);
    }
 
}

