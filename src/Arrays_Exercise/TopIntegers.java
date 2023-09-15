package Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = array_1.length;
        int maxSoFar = Integer.MIN_VALUE;
        List<Integer> topIntegers = new ArrayList<>();


        for (int i = n - 1; i >= 0; i--) {
            if (array_1[i] > maxSoFar) {
                topIntegers.add(array_1[i]);
                maxSoFar = array_1[i];
            }
        }

        List<Integer> reversedTopIntegers = new ArrayList<>();
        for (int i = topIntegers.size() - 1; i >= 0; i--) {
            reversedTopIntegers.add(topIntegers.get(i));
        }
        for (var i : reversedTopIntegers)
            System.out.print( i + " ");
    }
}
