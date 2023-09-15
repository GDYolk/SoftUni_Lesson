package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
