package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String substring = sc.nextLine();
        String word = sc.nextLine();

        while (word.contains(substring)) {
            int index = word.indexOf(substring);
            word = word.substring(0, index) + word.substring(index + substring.length());
        }

        System.out.println(word);
    }
}

