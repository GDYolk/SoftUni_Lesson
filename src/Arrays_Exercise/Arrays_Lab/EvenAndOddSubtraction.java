package Arrays_Exercise.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0, oddSum = 0;
        for (int value : array) {
            if (value % 2 == 0) evenSum += value;
            else                oddSum  += value;
        }
        System.out.println(evenSum - oddSum);
    }
}
