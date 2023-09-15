package Methods_Lab.Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        System.out.println(getThreeNumberMin(p1, p2, p3));
    }

    private static int getThreeNumberMin(int p1, int p2, int p3) {
        return Math.min(Math.min(p1, p2), p3);
    }
}
