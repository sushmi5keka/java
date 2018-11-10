package chapter_seven;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] x = {5, 4, 7, 9, 8, 3};
        Arrays.sort(x);
      
        ArrayAsmethodArgument.displayArray(x);
        
        for (int i : x) {
            System.out.print(i + " ");
        }

    }
}
