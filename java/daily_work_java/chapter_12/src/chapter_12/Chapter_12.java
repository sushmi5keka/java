
package chapter_12;

public class Chapter_12 {

    public static void main(String[] args) {
        System.out.println("111111111");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("u cant drive by zero...");
        }
        
        System.out.println("222222222");
        try {
            System.out.println(Integer.parseInt("TEN"));
        } catch (Exception e) {
            System.out.println("u cant parse ten, five etc.");
        }
    }
    
}
