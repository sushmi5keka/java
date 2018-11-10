
package com.coderbd;


public class ArrayWithSum {
    public static void main(String[] args) {
        int[] arr={2, 4, 5, 7, 3};
        int sum = 0 ;
        
        for(int a : arr){
            sum += a;
            System.out.print(" " + a);
        }
        System.out.println();
        System.out.println("sum : "+ sum);
    }
}
