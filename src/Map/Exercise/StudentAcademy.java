package Map.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> students = new LinkedHashMap<>();
        Map<String, Integer> counts = new LinkedHashMap<>();
        int count = Integer.parseInt(sc.nextLine());
        while (count > 0) {
            //students.putIfAbsent()
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, 0.0);
                counts.put(name, 1);
            } else counts.put(name, counts.get(name)+ 1);

            students.put(name, students.get(name) + grade);
            count--;
        }

        counts.forEach((key, value) -> students.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getKey(), key))
                .forEach(entry -> students.replace(entry.getKey(), entry.getValue() / value)));

        students.entrySet().stream().filter( v -> v.getValue() >= 4.50)
                .map(entry -> String.format("%s -> %.2f%n", entry.getKey(), entry.getValue()))
                .forEach(System.out::printf);
    }
}
