/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sir;

/**
 *
 * @author Ayaz
 */
public class TwoDArrayWithSum {
       public static void main(String[] args) {
        int[][] twoD = {
            {2, 8, 6},
            {1, 5, 9}
        };
        int sum = 0;
        for (int[] oneD : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
