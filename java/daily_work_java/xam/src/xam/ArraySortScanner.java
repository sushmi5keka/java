
package xam;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortScanner {
    public static void main(String[] args) {
         
        Scanner sca = new Scanner(System.in);
        int arraySize = sca.nextInt();
        int[] b = new int[arraySize];
        
        for (int i = 0; i < b.length; i++){
        b[i] =sca.nextInt();
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
