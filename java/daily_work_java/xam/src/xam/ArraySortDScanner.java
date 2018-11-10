
package xam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortDScanner {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        Integer[] c = new Integer[arraySize];
        
        for (int i = 0; i < c.length; i++){
        c[i] =scan.nextInt();
        }
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        System.out.println(Arrays.toString(c));
    }
}
