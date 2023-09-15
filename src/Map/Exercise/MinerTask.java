package Map.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> minerTask = new LinkedHashMap<>();

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("stop")) break;
            int n = Integer.parseInt(scanner.nextLine());

            minerTask.merge(s, n, Integer::sum);
        }

        minerTask.entrySet().stream()
                .map(entry -> entry.getKey() + " -> " + entry.getValue())
                .forEach(System.out::println);
    }
}
