
package com.coderbd;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("enter email : ");
        String email = input.nextLine();
        
        int atpos =email.indexOf("@");
        int dotpos =email.indexOf(".");
        
        if(atpos>0 && dotpos<email.length()-1 && atpos<dotpos-1 && email.length()>=7){
            System.out.println("email is valid");
        }else{
            System.out.println("email is invalid");
        }
    }
      
}
