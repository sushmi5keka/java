/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Ayaz
 */
public class JavaApplication2 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int[] a = {0, 2, 4, 1, 3};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[(a[i] + 3) % a.length];
            System.out.println(a[i]);
        }
        
System.out.println(a[1]);
    }

}
