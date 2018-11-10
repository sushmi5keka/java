package xam;


import java.math.BigInteger;

public class ChackPrimeNum {

    public static void main(String[] args) {
        int[] x = {2, 4, 9, 7, 11};
        checkPrime(x);
    }

    static void checkPrime(int[] numbers) {
        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
