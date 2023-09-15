package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int search = sc.nextInt();
        if (search > 0 && search < 8 )
            System.out.println(arr[search - 1]);
        else System.out.println("Invalid day!");
    }
}
