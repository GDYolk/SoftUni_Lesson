package LabBinnary;

public class BitPositionPrinter {

    public static void printBitPosition(int num, int p) {
        if (p < 0 || p >= 32) {
            System.out.println("Invalid bit position. The position should be between 0 and 31.");
            return;
        }

        int mask = 1 << p;
        int bitValue = (num & mask) >> p;

        System.out.println("Bit position " + p + " of " + num + " is: " + bitValue);
    }

    public static void main(String[] args) {
        int number = 1313; // Change this to your desired integer
        int position = 5; // Change this to the desired bit position

        printBitPosition(number, position);
    }
}
