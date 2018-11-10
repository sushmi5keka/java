package xam;


import java.math.BigInteger;
import java.util.Scanner;



public class IsPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        
        isPrime(number);
    }
    
    static void isPrime(int num){
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.println("is prime number...");
    }else{
        System.out.println("is not prime...");
    }
    }
}
