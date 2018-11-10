
package chapter_seven;

public class TwoDiementionalArray {
    public static void main(String[] args) {
       // int x[] = {2,3,5};
       // int y[] = {7,5,3};
        
        int twoD[][] ={
            {2,3,5,9},
            {7,5,3},
            {0,1,1}
        };
        for (int oneD[] : twoD){
            for (int i : oneD){
                System.out.print(i + " ");
            }
         
        System.out.println();
          
        }
         System.out.println("twoD [][] : " + twoD[1][1]);
         System.out.println("twoD [][] : " + twoD[2][0]);
         System.out.println();
    }
}
