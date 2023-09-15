package List_Test.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(
                        sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String[] command = sc.nextLine().split(" ");
            if (command[0].equals("end"))break;
            int firstCommand = Integer.parseInt(command[1]);
            switch (command[0]) {
                case "Delete" -> list.removeAll(Collections.singleton(firstCommand));
                case "Insert" -> list.add(Integer.parseInt(command[2]), firstCommand);
                default -> {
                }
            }
        }
        System.out.print(list.toString().replaceAll("[\\[\\],]", ""));
    }


}
