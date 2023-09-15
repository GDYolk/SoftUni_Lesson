package List_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 =
                Arrays.stream(
                        sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> list2 =
                        Arrays.stream(
                        sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        if (list1.size() > list2.size())
            result.addAll(getRemainingByElements(list2, list1));
        else result.addAll(getRemainingByElements(list1, list2));

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getRemainingByElements(List<Integer> startList, List<Integer> endList) {
        List<Integer> remaining = new ArrayList<>();
        for (int i = startList.size(); i < endList.size(); i++) {
            remaining.add(endList.get(i));
        }
        return remaining;
    }
}
