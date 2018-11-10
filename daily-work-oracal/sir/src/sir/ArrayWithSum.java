package sir;

public class ArrayWithSum {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 9};
        int sum = 0;

        for (int a : arr) {
            sum += a;
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }

}
