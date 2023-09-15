package List_Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list =
                            Arrays.stream(
                                     sc.nextLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        while (true){
            String command = sc.nextLine();
            if (command.equals("end"))break;

            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "Add" -> list.add(Integer.parseInt(commands[1]));
                case "Remove" -> list.remove(Integer.valueOf(Integer.parseInt(commands[1])));
                case "RemoveAt" -> {
                    int remove = Integer.parseInt(commands[1]);
                    list.remove(remove);
                }
                case "Insert" -> list.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
            }
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
