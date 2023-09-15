package Methods_Lab.Exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsCount {
    private static final Set<Character> vowels = new HashSet<>();
    static {
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
        vowels.add('i'); vowels.add('I');
        vowels.add('o'); vowels.add('O');
        vowels.add('u'); vowels.add('U');
    }
    public static void main(String[] args) {
        System.out.println(getVowelsCount(new Scanner(System.in).nextLine()));
    }

    private static int getVowelsCount(String value) {
        return (int) value.chars().mapToObj(character -> (char) character).filter(vowels::contains).count();
    }
}
