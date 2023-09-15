package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(sc.nextLine());
        BigInteger bigInteger1 = new BigInteger(sc.nextLine());

        BigInteger sum = bigInteger.add(bigInteger1);

        System.out.printf("%d", sum);
    }
}
