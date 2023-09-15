package List_Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list =
                        Arrays.stream(
                        sc.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> modifiedList = modifyList(list);
        System.out.println(modifiedList.toString().replaceAll("[\\[\\],]", ""));
    }
    public static List<Integer> modifyList(List<Integer> inputList) {
        int length = inputList.size();
        for (int i = 0; i < length / 2; i++) {
            int sum = inputList.get(i) + inputList.get(length - i - 1);
            inputList.set(i, sum);
        }
        return inputList.subList(0, (length + 1) / 2);
    }
}
