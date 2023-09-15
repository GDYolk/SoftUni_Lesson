package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
            System.out.println("elements.length = " + elements.length);
        for (int i = 0; i < elements.length / 2; i++) {
            String oldElement = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elements));
    }
}
