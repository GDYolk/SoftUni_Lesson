package Arrays_Exercise;

import java.util.Objects;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr_1 = scanner.nextLine().split(" ");
        String[] arr_2 = scanner.nextLine().split(" ");

            StringBuilder value = new StringBuilder();
        for (String s : arr_2) {
            for (String item : arr_1) {
                if (Objects.equals(s, item)) {
                    value.append(s).append(" ");
                }
            }
        }
        System.out.print(value);
    }
}
