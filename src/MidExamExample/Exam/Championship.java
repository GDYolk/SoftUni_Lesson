package MidExamExample.Exam;

import java.util.Scanner;

public class Championship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int requiredPoints = Integer.parseInt(scanner.nextLine());
        int swimmerCount = Integer.parseInt(scanner.nextLine());
        double hotelPricePerDay = Double.parseDouble(scanner.nextLine());
        double participationFee = Double.parseDouble(scanner.nextLine());

        double totalPointsEarned = 0;
        for (int i = 0; i < days; i++) {
            double points = Double.parseDouble(scanner.nextLine());
            totalPointsEarned += points + totalPointsEarned * 0.05;
        }

        double totalExpenses = swimmerCount * participationFee + swimmerCount * hotelPricePerDay * days;
        double sponsorCoverage = totalPointsEarned >= requiredPoints ? 0.25 : 0.10;
        double moneyLeftToPay = totalExpenses * (1 - sponsorCoverage);

        String championshipStatus = totalPointsEarned >= requiredPoints ? "successful" : "not successful";

        System.out.printf("Money left to pay: %.2f USD.%n", moneyLeftToPay);
        System.out.printf("The championship was %s.", championshipStatus);
    }
}
