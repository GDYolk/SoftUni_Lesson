package Methods_Lab.Exercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        for (int num = 1; num <= n; num++) {
            if (num % 2 != 0)
                if (isTopNumber(num)) {
                        System.out.println(num);
                }
        }
    }

    private static boolean isTopNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sumOfDigits = 0;
        int currentNumber = num;

        while (currentNumber != 0) {
            sumOfDigits += currentNumber % 10;
            currentNumber /= 10;
        }

        return sumOfDigits % 8 == 0;
    }
}
