package Methods_Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = Integer.parseInt(sc.nextLine());
        char c = sc.nextLine().charAt(0);
        int p2 = Integer.parseInt(sc.nextLine());
        System.out.println(calculate(p1, c, p2));
    }
    private static int calculate(int p1, char operator, int p2) {
        return switch (operator) {
            case '+' -> p1 + p2;
            case '-' -> p1 - p2;
            case '/' -> p1 / p2;
            case '*' -> p1 * p2;
            default -> 0;
        };
    }
}
