package Map.Exercise;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, String> signUp = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");

            switch (input[0]) {
                case "register":
                        if (!signUp.containsKey(input[1])){
                            signUp.put(input[1], input[2]);
                            System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                        }
                        else
                            System.out.printf("ERROR: already registered with plate number %s%n", input[2]);
                    break;
                case "unregister":
                        if (signUp.containsKey(input[1])) {
                            signUp.remove(input[1]);
                            System.out.printf("%s unregistered successfully%n", input[1]);
                        }
                        else
                            System.out.printf("ERROR: user %s not found%n", input[1]);
                    break;
            }
        }
        signUp.entrySet().stream()
                .map(entry -> entry.getKey() + " => " + entry.getValue())
                .forEach(System.out::println);
    }
}
