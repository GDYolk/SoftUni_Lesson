package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.println(getCharacterMultiplier(str));
    }
    static int getCharacterMultiplier(String[] str) {
        int sum = 0;

        int minLen = Math.min(str[0].length(), str[1].length());
        for (int i = 0; i < minLen; i++) {
            sum += str[0].charAt(i) * str[1].charAt(i);
        }

        int maxLen = Math.max(str[0].length(), str[1].length());
        for (int i = minLen; i < maxLen; i++) {
            if (str[0].length() > str[1].length())
                sum += str[0].charAt(i);
            else sum += str[1].charAt(i);
        }
        return sum;
    }
}
