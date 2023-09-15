package Methods_Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        printStartTriangle(new Scanner(System.in).nextInt());
    }
    public static void printStartTriangle(int start) {
        for (int i = 0; i < start; i++) {
            printLine(1, i);
        }
        printEndTriangle(start);
    }
    public static void printEndTriangle(int end) {
        for (int i = end; i >= 1; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int start, int end) {
        for (int j = start; j <= end; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
