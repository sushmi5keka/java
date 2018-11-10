
package com.coderbd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

public class ArrayAscDsc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  array length : ");
        int n = input.nextInt();
        
        Integer[] arr =new Integer[n];
        
        System.out.println("enter array value : ");
        for(int i=0; i<arr.length; i++){
        arr[i]=input.nextInt();
        }
            Arrays.sort(arr);
            Collections.reverse(Arrays.asList(arr));
            System.out.println(Arrays.toString(arr));
        
    }
}
