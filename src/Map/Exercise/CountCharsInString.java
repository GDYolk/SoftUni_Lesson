package Map.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        Map<Character, Long> counts = word.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        counts.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));

    }
}
