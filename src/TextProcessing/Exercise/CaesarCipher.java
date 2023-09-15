package TextProcessing.Exercise;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder encrypt = new StringBuilder();
        encrypt.append(toEncryptText(str));
        System.out.println(encrypt);

        System.out.println(convertEncryptText(encrypt.toString()));
    }
    public static String toEncryptText(String text) {
        return text.chars()
                .mapToObj(c -> (char)(c + 3))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
    private static String convertEncryptText(String text) {
        return text.chars()
                .mapToObj(c -> {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        return (char) (((c - base - 3) % 26) + base);
                    } else {
                        return (char) c - 3;
                    }
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

}
