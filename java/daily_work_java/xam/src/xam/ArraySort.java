
package xam;

import java.util.Arrays;

public class ArraySort {
    //////////////// array print //////////////////////
    public static void main(String[] args) {
         int[] a = { 2,5,8,4,9};
    for (int i : a){
            System.out.print(i + " ");
    }
        System.out.println(" ");
   ///////////////// array assanding sort /////////////////////////
   
    int[] b = { 2,5,8,4,9};
    Arrays.sort(b);
    for (int j : b){
            System.out.print(j + " ");
    }
        System.out.println(" ");
    //////////////// array desending sort /////////////////////////
    
     int[] c = { 2,5,8,4,9};
    Arrays.sort(c);
    for (int k=c.length-1; k>=0; k--){
            System.out.print(c[k] + " ");
    }
}
}
