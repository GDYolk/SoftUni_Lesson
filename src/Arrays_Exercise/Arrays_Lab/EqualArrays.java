package Arrays_Exercise.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array_1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array_2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int i = 0;
        while ( i < array_1.length) {
            if ( array_1[i] != array_2[i] ) break;
            else sum += array_1[i];
            i++;
        }
        if (i-1 == array_1.length - 1) System.out.printf("Arrays are identical. Sum: %d",sum);
        else System.out.printf("Arrays are not identical. Found difference at %d index.",i);
    }
}
