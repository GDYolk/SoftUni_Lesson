package Arrays_Exercise.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (nums.length > 0) {
            int[] condensed = new int[nums.length - 1];
            int currentLength = condensed.length;
            while (currentLength > 0 ) {
                for (int i = 0; i < currentLength; i++) {
                    condensed[i] = nums[i] + nums[i + 1];
                    nums[i] = condensed[i];
                }
                currentLength--;
            }
        }
        System.out.print(nums[0]);
    }
}
