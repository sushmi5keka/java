/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_seven;

public class ThreeDeArray {

    public static void main(String[] args) {

        int x[][] = {
            {2, 3, 5, 9},
            {7, 5, 3},
            {0, 1, 1}
        };

        int y[][] = {
            {2, 6, 5, 9},
            {8, 5, 3},
            {5, 1, 1}
        };

        int[][][] threeD = {
            {
                {2, 3, 5, 9},
                {7, 5, 3},
                {0, 1, 1}
            },
            {
                {2, 6, 5, 9},
                {8, 5, 3},
                {5, 1, 1}
            }

        };

        for (int twoD[][] : threeD) {
            for (int oneD[] : twoD) {
                for (int i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
