package com.coderbd;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        getOddEven(num);
    }

    static void getOddEven(int n) {
        if (n == 0) {
            System.out.println(n + " is zero.");
        } else {
            if (n % 2 == 0) {
                System.out.println(n + " is even number.");
            } else {
                System.out.println(n + " is odd number.");
            }
        }
    }
}
