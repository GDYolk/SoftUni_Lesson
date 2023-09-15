package Map;

import java.util.*;
/* HashMap map = new HashMap - Test
        3
        z
        y
        z
        u
        i
        k
        i - k
        z - y, u
 */
/*  LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        3
        z
        y
        z
        u
        i
        k
        z - y, u
        i - k
 */

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> word : words.entrySet()) {
            System.out.printf("%s - %s%n",
                    word.getKey(),
                    String.join(", ", word.getValue()));
        }

    }
}
