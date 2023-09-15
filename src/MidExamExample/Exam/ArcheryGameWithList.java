package MidExamExample.Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArcheryGameWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] targetsInput = scanner.nextLine().split("\\|");
        List<Integer> targets = new ArrayList<>();
        for (String target : targetsInput) {
            targets.add(Integer.parseInt(target));
        }

        int point = 0;
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Game over")) {
                break;
            }

            String[] parts = command.split("@");
            String action = parts[0];

            switch (action) {
                case "Shoot Left" -> {
                    int startIndex = Integer.parseInt(parts[1]);
                    int length = Integer.parseInt(parts[2]);
                    if (startIndex >= 0 && startIndex < targets.size()) {
                        for (int i = 0; i < length; i++) {
                            startIndex = (startIndex - 1 + targets.size()) % targets.size();
                        }
                        if (targets.get(startIndex) >= 5) {
                            targets.set(startIndex, targets.get(startIndex) - 5);
                            point += 5;
                        } else {
                            point += targets.get(startIndex);
                            targets.set(startIndex, 0);
                        }
                    }
                }
                case "Shoot Right" -> {
                    int startIndex = Integer.parseInt(parts[1]);
                    int length = Integer.parseInt(parts[2]);
                    if (startIndex >= 0 && startIndex < targets.size()) {
                        for (int i = 0; i < length; i++) {
                            startIndex = (startIndex + 1) % targets.size();
                        }
                        if (targets.get(startIndex) >= 5) {
                            targets.set(startIndex, targets.get(startIndex) - 5);
                            point += 5;
                        } else {
                            point += targets.get(startIndex);
                            targets.set(startIndex, 0);
                        }
                    }
                }
                case "Reverse" -> Collections.reverse(targets);
            }
        }

        for (int i = 0; i < targets.size(); i++) {
            System.out.print(targets.get(i));
            if (i < targets.size() - 1) {
                System.out.print(" - ");
            }
        }
        System.out.printf("%nJohn finished the archery tournament with %d points!", point);
    }
}
