
package chapter_seven;

public class AnalyzeNum {
    public static void main(String[] args) {
        double sum = 0;
        int n = 100;
        int x[] = new int[n];
        int bigNumber = 0;
        for (int i = 0; i<n ;i++){
        x[i] = i = 1;
        sum += x[i];
        }
        double avg = sum /n ;
        System.out.println("average : "+ avg);
        
        for(int i : x){
        if(i> avg){
        bigNumber++;
        }
            System.out.println("count : " + bigNumber);
        }
    }
}
