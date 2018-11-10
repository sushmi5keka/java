
package chapter_seven;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
          int[] x = {5, 9, 3, 5, 7};
          Arrays.sort(x);
          int newArray[]= new int[x.length];
          int j =0;
          for(int i=x.length-1; i>=0; i--){
          newArray[j]= x[i];
          j++;
          }
          for (int i : newArray){
              System.out.print(i +" ");
          }
          
    }
}
