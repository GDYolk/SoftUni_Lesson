package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(new Scanner(System.in).nextLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= bigInteger.intValue(); i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
