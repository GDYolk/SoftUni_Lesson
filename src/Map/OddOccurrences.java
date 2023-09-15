package Map;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> counts = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toMap(
                        String::toLowerCase,
                        value -> 1,
                        Integer::sum,
                        LinkedHashMap::new));

        String result = counts.entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
/*
Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }
 */