package MidExamExample;

import java.util.*;
import java.util.stream.Collectors;

public class MidExamInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {
            String[] line = sc.nextLine().trim().split(" - ");

            if (line[0].equals("Craft!")) break;

            switch (line[0]) {
                case "Collect":
                    if (!inventoryList.contains(line[1]))
                        inventoryList.add(line[1]);
                    break;
                case "Drop":
                    inventoryList.remove(line[1]);
                    break;
                case "Combine Items":
                    String[] items = line[1].split(":");
                    if (inventoryList.contains(items[0])) {
                        for (int i = 0; true; i++) {
                            if(Objects.equals(inventoryList.get(i), items[0])) {
                                inventoryList.add(i+1, items[1]);
                                break;
                            }
                        }
                    }
                    break;
                case "Renew":
                    for (int i = 0; i < inventoryList.size(); i++) {
                        if (Objects.equals(inventoryList.get(i), line[1])) {
                            inventoryList.add(inventoryList.remove(i));
                            break;
                        }
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", inventoryList));
    }
}
