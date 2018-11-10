
public class PalindomEx {

    public static void main(String[] args) {
        System.out.println(isPalindom("mom"));
        String[] p = {"abc", "mom", "wow", "bye", "yamay"};
        System.out.println(countPalindom(p));

        /*
        String s1 = "mom";
        String s2 = "Mom";
        if(s1.equalsIgnoreCase((s2))){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
         */
    }

    public static boolean isPalindom(String s) {
        boolean status = false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }
        return status;
    }

    public static int countPalindom(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPalindom(s[i])) {
                counter++;
            }
        }
        return counter;
    }

}
