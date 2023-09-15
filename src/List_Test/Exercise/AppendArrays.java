package List_Test.Exercise;

import java.util.*;

class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayStrings = scanner.nextLine();
        scanner.close();
        if (!arrayStrings.equals(" "))
            appendArrays(arrayStrings);
    }

    public static void appendArrays(String inputString) {
        String[] arrayStrings = inputString.trim().split("\\|");
        List<List<Integer>> arrays = new ArrayList<>();

        for (String arrayString : arrayStrings) {
            String[] valuesString = arrayString.trim().split("\\s+");
            //String formattedArray = transformString(valuesString);

            List<Integer> items = new ArrayList<>();
            for (String value : valuesString) {
                if (value.matches("-?\\d+"))
                    items.add(Integer.valueOf(value));
            }
            arrays.add(items);
        }
        // reverse
        Collections.reverse(arrays);

        // output
        for (List<Integer> value : arrays) {
            for (Integer output : value)
                System.out.print(output + " ");
        }
    }
}

/*
    public static String transformString(String[] input) {

        StringBuilder result = new StringBuilder();
        for (String part : input) {
            if (part.matches("\\d+\\.")) {  // Matches digits followed by a period
                part = part.replaceFirst("\\.", "");
            }
            result.append(part).append(" ");
        }

        return result.toString().trim();
    }
*/
