
package com.coderbd;

import java.math.BigInteger;
import static java.time.Clock.system;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
            System.out.println("enter a number : ");
            int num = input.nextInt();
            getFactorialNumber(num);
    }
    
    static void getFactorialNumber(int n){
        BigInteger f = BigInteger.valueOf(1);
        for(int i=1; i<=n; i++){
        f=f.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println( f);
    }
}
