package Map.Exercise;

import java.text.DecimalFormat;
import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Double> sameProducts = new LinkedHashMap<>();

        while (true) {
            String[] s = sc.nextLine().split(" ");

            if (s[0].equals("buy"))     break;

            input(products, sameProducts, s);
        }

        replaceValue(products, sameProducts);
        print(products);
    }

    private static void replaceValue(Map<String, Double> products, Map<String, Double> sameProducts) {
        sameProducts.forEach((key, value) -> products.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getKey(), key))
                .forEach(entry -> products.replace(entry.getKey(), entry.getValue() * value)));
    }

    private static void input(Map<String, Double> products, Map<String, Double> sameProducts, String[] s) {
        if (!products.containsKey(s[0]))
                products.put(s[0], 0.0);

        sameProducts.put(s[0], Double.parseDouble(s[1]));

        products.put(s[0], products.get(s[0]) + Double.parseDouble(s[2]));
    }

    private static void print(Map<String, Double> products) {
        products.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " -> " +
                        new DecimalFormat("0.00").format(entry.getValue()))
                .forEach(System.out::println);
    }
}
