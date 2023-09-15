package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        switch (s) {
            case "int" -> System.out.println(getMax(Integer.parseInt(p1), Integer.parseInt(p2)));
            case "char", "string" -> System.out.println(getMax(p1, p2));
        }
    }

    private static int getMax(int p1, int p2) {
        return Math.max(p1, p2);
    }
    private static String getMax(String s1, String s2) {
        if (s1.compareTo(s2) >= 0)
            return s1;
        return s2;
    }
}
