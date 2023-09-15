package Methods_Lab.Exercises;

import java.util.Scanner;

class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        long factorial1 = calculateFactorial(num1);

        int num2 = scanner.nextInt();
        long factorial2 = calculateFactorial(num2);

        scanner.close();

        double divisionResult = (double) factorial1 / factorial2;
        System.out.printf("%.2f%n", divisionResult);

    }

    private static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
