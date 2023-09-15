package Methods_Lab.Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(getMiddleCharacters(s));
    }

    private static String getMiddleCharacters(String s) {
        String s1 = String.valueOf(s.charAt(s.length() / 2));
        if (s.length() % 2 != 0)
            return s1;
        else
            return s.charAt((s.length() / 2) - 1) + s1;
    }
}

