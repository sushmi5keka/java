package xam;


import java.math.BigInteger;
import java.util.Scanner;



public class PrimeNumberIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        isPrime(number);
    }
    
    static void isPrime(int num){
        if (BigInteger.valueOf(num).isProbablePrime(1)){
            System.out.println(num + " is prime...");
        }else{
            System.out.println(num + " is not prime...");
        }
    }
}
