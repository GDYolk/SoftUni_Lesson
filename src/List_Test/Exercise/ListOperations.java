package List_Test.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String input = scanner.nextLine();
        String[] initialNumbers = input.split(" ");
        for (String num : initialNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }

            String[] tokens = command.split(" ");
            String operation = tokens[0];

            switch (operation) {
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                }
                case "Insert" -> {
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if (indexToInsert >= 0 && indexToInsert <= numbers.size()) {
                        numbers.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" -> {
                    int count = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int firstNumber = numbers.remove(0);
                            numbers.add(firstNumber);
                        }
                    } else if (tokens[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int lastNumber = numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }
                    }
                }
                default -> {
                }
                //System.out.println("Invalid command");
            }
        }

        // Print the final list
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
