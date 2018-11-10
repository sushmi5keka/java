/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NumericTypeConversion {
    public static void main(String[] args) {
        int x = 10;
        long y= x;
        System.out.println("x : " + x + " y : " + y);
        
        long p = 15;
        int q = (int) p;
        System.out.println("p :" + p + " Q : " + q);
        
        double z = p;
        float r = p;
        
        long a = 500;
        int b = (int) a ;
        System.out.println("a : " + a + " B : " + b);
              
    }
}
