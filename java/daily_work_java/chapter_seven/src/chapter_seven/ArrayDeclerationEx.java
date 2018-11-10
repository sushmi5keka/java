
package chapter_seven;

public class ArrayDeclerationEx {
    
    public static void main(String[] args) {
        int[] x = new int[2];
        x[0]= 10;
        x[1]= 25;
        System.out.println("x[0] : " + x[0]);
         System.out.println("x[1] : " + x[1]);
          System.out.println("x : " + x);
          
          for (int i : x){
              System.out.println(i);
          }
          int p[] = {10, 25, 5, 15, 20, 52, 35};
          System.out.println("length : " + p.length);
          System.out.println("p[5] : " + p[5]);
          p = new int[9];
           for (int j : p){
              System.out.println(j);
          }
    }
    
}
