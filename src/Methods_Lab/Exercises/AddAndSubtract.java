package Methods_Lab.Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 , p2, p3;
        p1 = scanner.nextInt();
        p2 = scanner.nextInt();
        p3 = scanner.nextInt();
        System.out.println(getAddAndSubtract(p1, p2, p3));
    }

    private static int getAddAndSubtract(int p1, int p2, int p3) {
        return (p1 + p2) - p3;
    }

}
