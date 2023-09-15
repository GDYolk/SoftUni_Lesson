package Map.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> employees = new LinkedHashMap<>();
        while (true) {
            String[] companyUser = scanner.nextLine().split("->");
            if (companyUser[0].equals("End")) {
                break;
            }
            String companyName = companyUser[0];
            String employeeId = companyUser[1];

            employees.putIfAbsent(companyName, new ArrayList<>());
            if (!employees.get(companyName).contains(employeeId))
                employees.get(companyName).add(employeeId);
        }

        employees.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.forEach(id -> System.out.printf("--%s%n", id));
        });
    }
}