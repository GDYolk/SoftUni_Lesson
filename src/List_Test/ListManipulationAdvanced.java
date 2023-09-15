package List_Test;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args){
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
                case "Contains" -> {
                    int n = Integer.parseInt(commands[1]);
                    printContains(list, n);
                }
                case "Print" -> {
                    List<Integer> midList = new ArrayList<>();
                    if (Objects.equals(commands[1], "even"))
                        printEven(list, midList);
                    else if (Objects.equals(commands[1], "odd"))
                        printOdd(list, midList);
                }
                case "Get" -> System.out.println(getTotalSumList(list));
                case "Filter" -> {
                    int number = Integer.parseInt(commands[2]);
                    List<Integer> sort = new ArrayList<>(list);
                    printFilter(sort, commands[1], number);
                }
                default -> {
                }
            }
        }
    }


    private static void printFilter(List<Integer> list, String command, int number) {
        List<Integer> filter = new ArrayList<>();
        switch (command) {
            case "<" -> filter = list.stream().filter(e -> e < number).collect(Collectors.toList());
            case "<=" -> filter = list.stream().filter(e -> e <= number).collect(Collectors.toList());
            case ">" -> filter = list.stream().filter(e -> e > number).collect(Collectors.toList());
            case ">=" -> filter = list.stream().filter(e -> e >= number).collect(Collectors.toList());
            default -> {
            }
        }
        printList(filter);
    }
    private static void printList(List<Integer> list) {
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static int getTotalSumList(List<Integer> list) {
        int totalSum = 0;
        for (int item : list)
            totalSum += item;
        return totalSum;
    }

    private static void printOdd(List<Integer> list, List<Integer> midList) {
        for (int item : list)
            if (item % 2 != 0)
                midList.add(item);

        printList(midList);
    }
    private static void printEven(List<Integer> list, List<Integer> midList) {
        for (int item : list)
            if (item % 2 == 0)
                midList.add(item);

        printList(midList);
    }

    private static void printContains(List<Integer> list, int item) {
        if(list.contains(item))
            System.out.println("Yes");
        else System.out.println("No such number");
    }

}
