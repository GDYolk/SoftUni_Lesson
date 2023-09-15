package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
    }

    private static double mathPower(double number, int power) {
        return Math.pow(number, power);
    }
}
