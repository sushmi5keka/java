package sir;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length : ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("enter array value :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Min: " + arr[0]);
        System.out.println("Max: " + arr[arr.length - 1]);

    }
}
