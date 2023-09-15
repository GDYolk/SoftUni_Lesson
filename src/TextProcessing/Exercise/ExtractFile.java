package TextProcessing.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\\\");

        Arrays.stream(input).filter(item -> item.contains("."))
                .map(item -> item.split("\\."))
                .map(item -> String.format("File name: %s%nFile extension: %s", item[0], item[1]))
                .forEach(System.out::printf);
    }
}
//        for (String s : input) {
//            if (s.contains(".")) {
//                String[] token = s.split("\\.");
//                System.out.printf("File name: %s%n" +
//                        "File extension: %s",token[0], token[1]);
//            }
//        }