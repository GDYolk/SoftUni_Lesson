package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        System.out.print(getArea(width, height));
    }

    private static int getArea(int width, int height) {
        return width * height;
    }
}
