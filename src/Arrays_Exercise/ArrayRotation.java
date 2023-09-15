package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int startIndex = scanner.nextInt(); // rotations startIndex
        int length = elements.length; // array length get
        int[] rotatedArray = new int[length]; // new array
        startIndex %= length; // Ensure rotations are within the range of array length

        int endIndex = length - startIndex;

        if (endIndex > 0)
            System.arraycopy(elements, startIndex, rotatedArray, 0, endIndex);

        System.arraycopy(elements, 0, rotatedArray,  endIndex, startIndex);

        for (int i : rotatedArray)
            System.out.print(i + " ");
    }
}
