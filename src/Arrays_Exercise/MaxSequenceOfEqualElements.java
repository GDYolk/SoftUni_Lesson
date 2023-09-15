package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder arrayBuild = new StringBuilder();
        int value = Integer.MIN_VALUE;
        int temp = 0;
        int count = 0;
        int maxElements = 0;
        for (int j : array) {
            if (j == value) {
                count++;
                if (count > temp) {
                    maxElements = j;
                    temp = count;
                }

            } else {
                count = 0;
                value = j;
            }
        }
        for (int i = 0; i <= temp; i++) {
            arrayBuild.append(maxElements).append(" ");
        }
        System.out.print(arrayBuild);
    }
}
