package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagon = scanner.nextInt();
        int[] people = new int[wagon];
        int peopleSum = 0;
        for (int i = 0; i < wagon; i++) {
            people[i] = scanner.nextInt();
            peopleSum+=people[i];
        }
        for (int value : people)
            System.out.print(value+" ");
        System.out.print("\n"+peopleSum);
    }
}
