package List_Test.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(
                        sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bomb = sc.nextLine().split(" ");

        int removeIndex = Integer.parseInt(bomb[1]);
        int bombValue = Integer.parseInt(bomb[0]);

        for (int i = 0; i < list.size(); i++) {
            if (bombValue == list.get(i)){
                int leftRange = Math.max(0, i - removeIndex);
                int rightRange = Math.min(list.size(), i + removeIndex + 1);
                list.subList(leftRange, rightRange).clear();
                i = -1;
            }
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.print(sum);
    }
}
