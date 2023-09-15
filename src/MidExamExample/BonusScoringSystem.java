package MidExamExample;

import java.util.*;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine());
        int lectures = Integer.parseInt(sc.nextLine());
        int bonus = Integer.parseInt(sc.nextLine());

        double maxBonus = 0;

        int attendance = 0;
        while (students > 0) {

            int attendances = Integer.parseInt(sc.nextLine());
            double totalBonus = attendances / (double) lectures* (5 + bonus);
            if (totalBonus >= maxBonus) {
                maxBonus = totalBonus;
                attendance = attendances;
            }
            students--;
        }

        System.out.printf("Max Bonus: %d.%n",(int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", attendance);

    }
}
