
package com.coderbd;

public class TwoDArrayWithSum {
    public static void main(String[] args) {
        int[][] twoD = {
            {2, 4, 6},
            {3, 6, 9}
        };
        int sum = 0;
        
        for(int[] oneD : twoD){
        for(int a : oneD){
            sum += a;
            System.out.print(a + " ");
        }
            System.out.println();
        }
        System.out.println("sum : " + sum);
    }
}
