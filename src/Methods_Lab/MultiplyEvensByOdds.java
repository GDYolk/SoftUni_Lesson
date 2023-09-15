package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        int number = Math.abs(new Scanner(System.in).nextInt());
        System.out.print(getMultipleOfEvensAnOdds(number));
    }

    private static int getMultipleOfEvensAnOdds(int number) {
        return getEvenSum(number) * getOddSum(number);
    }

    private static int getEvenSum(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 2 == 0)
                sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    private static int getOddSum(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 2 != 0)
                sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
