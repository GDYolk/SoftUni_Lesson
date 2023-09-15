import java.util.Scanner;

public class TestTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] strings = input.split("\\s+"); // Split input into individual strings
        double totalSum = 0.0;

        for (String str : strings) {
            char beforeChar = str.charAt(0);
            char afterChar = str.charAt(str.length() - 1);
            int number = Integer.parseInt(str.substring(1, str.length() - 1));

            double result;

            if (Character.isUpperCase(beforeChar)) {
                result = number / (beforeChar - 'A' + 1);
            } else {
                result = number * (beforeChar - 'a' + 1);
            }

            if (Character.isUpperCase(afterChar)) {
                result -= (afterChar - 'A' + 1);
            } else {
                result += (afterChar - 'a' + 1);
            }

            totalSum += result;
        }

        System.out.printf("%.2f", totalSum);
    }
}
