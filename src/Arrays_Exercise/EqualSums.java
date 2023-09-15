package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

class EqualSums {

    public static void main(String[] args) {
        // Calculate the total sum of the array
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Initialize leftSum to 0
        int leftSum = 0;

        int index = -1;
        for (int i = 0; i < n; i++) {
            // Calculate rightSum (totalSum - leftSum - current element)
            int rightSum = totalSum - leftSum - arr[i];

            // Check if leftSum is equal to rightSum
            if (leftSum == rightSum) {
                index = i;
            }

            // Update leftSum for the next iteration
            leftSum += arr[i];
        }

        if (index != -1)
            System.out.print(index);
        else System.out.print("no");
    }
}
