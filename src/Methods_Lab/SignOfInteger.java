package Methods_Lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        printSign(new Scanner(System.in).nextInt());
    }
    public static void printSign(int n) {
        if (n > 0) System.out.printf("The number %d is positive", n);
        else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        }
        else System.out.printf("The number %d is zero.", n);
    }
}
