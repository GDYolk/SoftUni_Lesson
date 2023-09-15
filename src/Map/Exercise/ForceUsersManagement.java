package Map.Exercise;

import java.util.*;

public class ForceUsersManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sidesToUsers = new LinkedHashMap<>();

        String input = scanner.nextLine();


        while (!input.equals("Lumpawaroo")) {

            String[] tokens = input.split("\\s+\\|\\s+|\\s+->\\s+");

            if (Arrays.stream(input.split("\\s+")).noneMatch(d -> d.contains("->"))) {
                String forceSide = tokens[0];
                String forceUser = tokens[1];

                sidesToUsers.putIfAbsent(forceSide, new ArrayList<>());
                if (sidesToUsers.values().stream().noneMatch(list -> list.contains(forceUser))) {
                    sidesToUsers.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = tokens[0];
                String forceSide = tokens[1];

                boolean userExists = sidesToUsers.values().stream().anyMatch(list -> list.contains(forceUser));
                if (userExists) {
                    sidesToUsers.forEach((side, users) -> users.remove(forceUser));
                }

                sidesToUsers.putIfAbsent(forceSide, new ArrayList<>());
                sidesToUsers.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        sidesToUsers.entrySet().stream()
                .filter(entry -> !entry.getValue().isEmpty())
                //.sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
                });
    }
}
