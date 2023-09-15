package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger p = sc.nextBigInteger();
        BigInteger p1 = sc.nextBigInteger();
        BigInteger value = p.multiply(p1);

        System.out.println(value);
    }
}
