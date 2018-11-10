
package classtest;

public class sum {
    int x = 10;
    int y = 20;
    public static void main(String[] args) {
        sum m = new sum();
        int result =m.makeSum(m.x,m.y);
        System.out.println("Result : " + result);
    }
    
    public int makeSum(int startNum,int endNum){
    int sum = startNum + endNum;
    return sum;
    }
    
}
