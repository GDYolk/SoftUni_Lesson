package Methods_Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String func = sc.nextLine();
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        switch (func) {
            case "add" -> add(firstNumber, secondNumber);
            case "multiply" -> multiply(firstNumber, secondNumber);
            case "subtract" -> subtract(firstNumber, secondNumber);
            case "divide" -> divide(firstNumber, secondNumber);
            default -> {
            }
        }

    }
    public static void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
    public static void multiply(int n1, int n2){
        System.out.println(n1 * n2);
    }
    public static void subtract(int n1, int n2){
        System.out.println(n1 - n2);
    }
    public static void divide(int n1, int n2){
        System.out.println(n1 / n2);
    }
}
