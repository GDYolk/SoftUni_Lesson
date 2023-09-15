package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits.append(str.charAt(i));
            } else if (Character.isLetter(str.charAt(i))) {
                letters.append(str.charAt(i));
            } else  {
                character.append(str.charAt(i));
            }
        }
        System.out.printf("%s%n%s%n%s%n", digits, letters, character);
    }
}
