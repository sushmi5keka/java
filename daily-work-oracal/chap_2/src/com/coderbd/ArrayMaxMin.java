
package com.coderbd;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length : ");
        int n = input.nextInt();
        
        Integer[] arr = new Integer[n];
        
        System.out.println("enter array value : ");
        for(int i=0; i<arr.length; i++){
        arr[i]= input.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("Max : " + arr[arr.length-1]);
        System.out.println("Min : " + arr[0]);
    }
}
