package List_Test;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.stream(
                                new Scanner(System.in)
                                        .nextLine()
                                        .split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        list.removeIf(e -> e < 0);

        if (list.isEmpty())
            System.out.println("empty");
        else {
            Collections.reverse(list);
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
