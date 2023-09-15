package TextProcessing.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = sc.nextLine().split(", ");

        Arrays.stream(usernames).filter(ValidUsernames::isValidUsername).forEach(System.out::println);
    }
    public static boolean isValidUsername(String username) {
        // Check length
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        // Check characters using regular expression
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9-_]+$");
        return pattern.matcher(username).matches();
    }
}
