package com.coderbd;

import java.util.Scanner;

public class Fabonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a number for a : ");
        int a = input.nextInt();

        System.out.println("enter a number for b : ");
        int b = input.nextInt();

        for (int i = 0; i < 10; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

}
