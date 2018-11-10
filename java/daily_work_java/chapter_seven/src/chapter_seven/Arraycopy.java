/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_seven;

/**
 *
 * @author User
 */
public class Arraycopy {

    public static void main(String[] args) {
        int sourceArray[] = {2, 6, 8, 5};
        int targetArray[] = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];

            for (int j : targetArray) {
                System.out.print(j + " ");
            }
        }
        ////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("==========array copy ===============");
        int s[] = {1, 3, 5};
        int t[] = new int[10];

        System.arraycopy(s, 1, t, 5, 2);
        for (int p : t) {
            System.out.print(p + " ");
        }
    }
}
