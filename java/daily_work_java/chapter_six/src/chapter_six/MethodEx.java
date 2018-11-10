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
public class MethodEx {
    
    String abc;
    
    
    public static void main(String[] args) {
        
    }
    //method 1
    public void display(){
        System.out.println("Hi,I am from void Method");
    }
    //method 2
    public int display2(){
        int x = 5;
        return x;
    }
    //method 3
    public String display3(){
        return "hello World";
    }
    //method 4
    public String display4(){
        String y= "hello World";
        return y;
    }
    //method 5
    public String display5(){
        abc = " hello abc";
        return abc;
    }
    
}
