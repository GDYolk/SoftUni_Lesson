package Methods_Lab.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopNumbersTest2 {
        public static boolean isTopNumber(int number) {
            int sumOfDigits = 0;
            int temp = number;

            // Calculate the sum of digits
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }

            // Check if the sum of digits is divisible by 8
            if (sumOfDigits % 8 == 0) {
                // Check if the number contains at least one odd digit
                temp = number;
                while (temp > 0) {
                    int digit = temp % 10;
                    if (digit % 2 != 0) {
                        return true;
                    }
                    temp /= 10;
                }
            }
            return false;
        }

        public static List<Integer> findTopNumbers(int limit) {
            List<Integer> topNumbers = new ArrayList<>();

            for (int num = 17; num <= limit; num++) {
                if (isTopNumber(num)) {
                    topNumbers.add(num);
                }
            }

            return topNumbers;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            List<Integer> topNumbers = findTopNumbers(n);

            for (int topNum : topNumbers) {
                System.out.println(topNum);
            }
        }
}
