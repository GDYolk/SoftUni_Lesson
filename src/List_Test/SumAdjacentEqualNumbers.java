package List_Test;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = new ArrayList<>(Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList()));

        for (int i = 0; i < list.size()-1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                list.set(i, (list.get(i)+list.get(i + 1)));
                list.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(list));
    }

    private static String joinElementsByDelimiter(List<Double> list) {
        StringBuilder output = new StringBuilder();
        for (Double item : list){
            output.append(new DecimalFormat("0.#").format(item)).append(" ");
        }
        return output.toString();
    }

}
