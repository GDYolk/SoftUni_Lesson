package Methods_Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        printInWords(new Scanner(System.in).nextDouble());
    }
    public static void printInWords(double grade) {
        if (grade >= 2.00 && grade <= 2.99) System.out.println("Fail");
        else if (grade >= 3.00 && grade <=3.49) System.out.println("Poor");
        else if (grade >= 3.50 && grade <= 4.49) System.out.println("Good");
        else if (grade >= 4.50 && grade <= 5.49) System.out.println("Very good");
        else if (grade >= 5.50 && 6.00 >= grade) System.out.println("Excellent");
    }
}
