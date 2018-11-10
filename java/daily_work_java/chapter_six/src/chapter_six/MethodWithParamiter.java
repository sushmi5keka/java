/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_six;

/**
 *
 * @author User
 */
public class MethodWithParamiter {

    int x = 10;
    int y = 20;
    int z = 30;

    public static void main(String[] args) {
        MethodWithParamiter m = new MethodWithParamiter();
        int rs = m.makeSum(m.x, m.y, m.z, 40, 50, 60, 70, 80, 90, 100);
        System.out.println("Rs : " + rs);
    }

    public int makeSum(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        return sum;
    }
}
