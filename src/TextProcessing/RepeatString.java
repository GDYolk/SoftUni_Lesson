package TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        Arrays.stream(
                scanner.nextLine().split(" "))
                .forEach(
                        word -> result.append(word.repeat(word.length())));

        System.out.print(result);
    }
}
