package Map.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> courses = new LinkedHashMap<>();
        while (true) {
            String[] input = scanner.nextLine().split(" : ");
            if (input[0].equals("end")) break;

            courses.putIfAbsent(input[0], new ArrayList<>());
            courses.get(input[0]).add(input[1]);
        }

        courses.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            value.forEach(student -> System.out.println("-- " + student));
        });

    }
}
