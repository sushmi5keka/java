
import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a degree in Fahrenheit : ");
        double fahrenheit = input.nextDouble();
        
        //convert Fahrenhite to Celsius
        double celsius =(5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit" + fahrenheit + " is " + celsius + " in celsius");
    }
}
