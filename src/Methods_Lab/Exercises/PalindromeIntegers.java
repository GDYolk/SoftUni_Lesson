package Methods_Lab.Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("END")) break;

            System.out.println(getPalindrome(s));
        }
        scanner.close();
    }

    private static boolean getPalindrome(String s) {
        int left = 0, right = s.length()-1;
        boolean palindrome = false;

        while(left <= s.length() / 2) {
            if (s.charAt(left) == s.charAt(right)) palindrome = true;
            else break;

            left++;
            right--;
        }
        return palindrome;
    }
}
