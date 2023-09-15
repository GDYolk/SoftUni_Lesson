package Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> treasure = new ArrayList<>(Arrays.asList(sc.nextLine().split("\\|")));

        String input;
        while (true) {
            input = sc.nextLine();
            if (input.equals("Yohoho!")) {
                break;
            }

            String[] command = input.split(" ");
            String action = command[0];

            switch (action) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        String item = command[i];
                        if (!treasure.contains(item)) {
                            treasure.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < treasure.size()) {
                        String temp = treasure.get(index);
                        treasure.remove(index);
                        treasure.add(temp);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    List<String> stolenItems = new ArrayList<>();
                    for (int i = 0; i < count && !treasure.isEmpty(); i++) {
                        int lastIndex = treasure.size() - 1;
                        stolenItems.add(0, treasure.remove(lastIndex));
                    }
                    System.out.println(String.join(", ", stolenItems));
                    break;
                default:
                    break;
            }
        }

        if (!treasure.isEmpty()) {
            double averageGain = treasure.stream().mapToInt(String::length).average().orElse(0);
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.print("Failed treasure hunt.");
        }
    }
}
