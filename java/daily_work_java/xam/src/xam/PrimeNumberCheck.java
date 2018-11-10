package xam;


import java.math.BigInteger;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int[] x = {2, 4, 5, 7, 8, 11};
        checkNumber(x);
    }

    static void checkNumber(int[] numbers) {
        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }
       }
        System.out.println();
    }
}

