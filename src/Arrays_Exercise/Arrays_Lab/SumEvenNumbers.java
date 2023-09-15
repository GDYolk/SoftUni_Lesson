package Arrays_Exercise.Arrays_Lab;

import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int j : array) {
            if (j % 2 == 0)
                evenSum += j;
        }
        System.out.print(evenSum);
    }
}
