package Map.Exercise;

import java.util.*;

public class SoftUniExamResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> usernamePoints = new LinkedHashMap<>();
        Map<String, Integer> submissionsCounts = new LinkedHashMap<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("exam finished")) {
                break;
            }

            String[] tokens = input.split("-");
            String username = tokens[0];
            if (tokens[1].equals("banned")) {
                usernamePoints.remove(username);
                continue;
            }
            String language = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            usernamePoints.putIfAbsent(username, 0);
            if (points > usernamePoints.get(username)) {
                usernamePoints.put(username, points);
            }

            submissionsCounts.put(language, submissionsCounts.getOrDefault(language, 0) + 1);
        }

        System.out.println("Results:");
        usernamePoints.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));

        System.out.println("Submissions:");
        submissionsCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
