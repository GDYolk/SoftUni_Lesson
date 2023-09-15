package LabBinnary;

import java.util.Scanner;

public class BitLeft {
    private  static void printBitLeft(int num, int p) {
        if (p < 0 || p >= 32) {
            System.out.println("Invalid bit position. The position should be between 0 and 31.");
            return;
        }
        int mask = num << p;
        int bitValue = (num & mask) >> p;
        System.out.println("Bit position " + p + " of " + num + " is: " + bitValue);
        System.out.println(mask - num);
        System.out.println(mask);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        printBitLeft(n, p);
    }
}
