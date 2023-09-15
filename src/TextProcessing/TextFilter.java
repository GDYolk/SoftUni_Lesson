package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] banWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (String banWord : banWords) {
            text = text.replace(banWord, "*".repeat(banWord.length()));
        }
        System.out.println(text);
    }
}
