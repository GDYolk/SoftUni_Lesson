package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr_1 = new int[n];
        int[] arr_2 = new int[n];
        boolean is = false;
        for (int i = 0; i < n; i++) {
            int[] temp = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (!is) {
                arr_1[i] = temp[0];
                arr_2[i] = temp[1];
                is = true;
            }else{
                arr_1[i] = temp[1];
                arr_2[i] = temp[0];
                is = false;
            }
        }
        for (int i : arr_1)
            System.out.print(i + " ");

        System.out.println();
        for (int i : arr_2)
            System.out.print(i + " ");
    }
}
