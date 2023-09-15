package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        double price = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        switch (order) {
            case "coffee" -> totalPrice = totalPrie(price, 1.50);
            case "water" -> totalPrice = totalPrie(price, 1.00);
            case "coke" -> totalPrice = totalPrie(price, 1.40);
            case "snacks" -> totalPrice = totalPrie(price, 2.00);
            default -> {
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
    public static double totalPrie(double p, double pr) {
        return p * pr;
    }
}
