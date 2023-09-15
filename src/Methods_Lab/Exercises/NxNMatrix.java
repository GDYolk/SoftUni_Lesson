package Methods_Lab.Exercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        nxnMatrix(new Scanner(System.in).nextInt());
    }
    private static void nxnMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
