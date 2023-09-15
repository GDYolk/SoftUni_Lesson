package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p = Integer.parseInt(sc.nextLine());
        System.out.println(printAddString(s, p));
    }

    private static String printAddString(String s, int p) {
        return String.valueOf(s).repeat(Math.max(0, p));
    }
}
