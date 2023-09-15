package Map.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaryFarming = new LinkedHashMap<>();

        legendaryFarming.put("shards", 0);
        legendaryFarming.put("fragments", 0);
        legendaryFarming.put("motes", 0);

        String result = "";

        while (result.equals("")) {
            String[] items = scanner.nextLine().split(" ");

            // Process items using Stream API
            for (int i = 0; i < items.length - 1; i += 2) {
                int quantity = Integer.parseInt(items[i]);
                String item = items[i + 1].toLowerCase();
                legendaryFarming.putIfAbsent(item, 0);
                legendaryFarming.compute(item, (key, value) -> value != null ? value + quantity : quantity);

                if (legendaryFarming.get("shards") >= 250) {
                    result = "Shadowmourne";
                    legendaryFarming.merge("shards", 250, (oldValue, newValue) -> oldValue - newValue);
                    break;
                } else if (legendaryFarming.get("fragments") >= 250) {
                    result = "Valanyr";
                    legendaryFarming.merge("fragments", 250, (oldValue, newValue) -> oldValue - newValue);
                    break;
                } else if (legendaryFarming.get("motes") >= 250) {
                    result = "Dragonwrath";
                    legendaryFarming.merge("motes", 250, (oldValue, newValue) -> oldValue - newValue);
                    break;
                }
            }
        }
        System.out.printf("%s obtained!%n", result);
        legendaryFarming.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}
