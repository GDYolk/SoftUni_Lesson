package Methods_Lab.Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isBetween6And10Chars(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!consistsOnlyOfLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasAtLeast2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    private static boolean isValidPassword(String password) {
        return isBetween6And10Chars(password) &&
                consistsOnlyOfLettersAndDigits(password) &&
                hasAtLeast2Digits(password);
    }

    private static boolean isBetween6And10Chars(String password) {
        int length = password.length();
        return length >= 6 && length <= 10;
    }

    private static boolean consistsOnlyOfLettersAndDigits(String password) {
        return password.matches("[a-zA-Z0-9]+");
    }

    private static boolean hasAtLeast2Digits(String password) {
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
                if (digitCount >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}

