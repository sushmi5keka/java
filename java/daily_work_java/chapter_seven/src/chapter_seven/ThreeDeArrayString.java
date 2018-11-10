package chapter_seven;

public class ThreeDeArrayString {

    public static void main(String[] args) {
       /* String x[][] = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h"}
        };

        String y[][] = {
            {"i", "j", "k"},
            {"l", "m", "n"},
            {"o", "p"}
        };

        String z[][] = {
            {"l", "i", "v", "e"},
            {"t", "h", "e"},
            {"l", "i", "f", "e"}
        };*/
       
        String[][][] threeD = {
            {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h"}
            },
            {
                {"i", "j", "k"},
                {"l", "m", "n"},
                {"o", "p"}
            },
            {
                {"l", "i", "v", "e"},
                {"t", "h", "e"},
                {"l", "i", "f", "e"}
            }
        };

    for (String twoD[][] : threeD) {
            for (String oneD[] : twoD) {
            for (String i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

}


