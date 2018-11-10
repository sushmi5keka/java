package Inharetens2;

import Inharitens.*;

public class Test_A_B {

    public static void main(String[] args) {
        A a1 = new A();

        B b1 = new B();
        A b2 = new B();

        C c1 = new C();
        B c2 = new C();
        A c3 = new C();

        System.out.println(a1 instanceof A);
        
        System.out.println(b1 instanceof B);
        System.out.println(b2 instanceof B);
        
        System.out.println(c1 instanceof C);
        System.out.println(c2 instanceof C);
        System.out.println(c3 instanceof C);
    }
}
