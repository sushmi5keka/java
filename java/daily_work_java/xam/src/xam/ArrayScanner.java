
package xam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] a = new int[arraySize];
        
        for (int i = 0; i < a.length; i++){
        a[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        
        
     
    }
}
