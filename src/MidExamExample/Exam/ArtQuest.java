package MidExamExample.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtQuest {

    public static void changePaintings(List<Integer> paintings, int oldNumber, int newNumber) {
        int index = paintings.indexOf(oldNumber);
        if (index != -1) {
            paintings.set(index, newNumber);
        }
    }

    public static void hidePainting(List<Integer> paintings, int paintingNumber) {
        paintings.removeIf(number -> number == paintingNumber);
    }

    public static void switchPaintings(List<Integer> paintings, int number1, int number2) {
        int index1 = paintings.indexOf(number1);
        int index2 = paintings.indexOf(number2);
        if (index1 != -1 && index2 != -1) {
            paintings.set(index1, number2);
            paintings.set(index2, number1);
        }
    }

    public static void insertPainting(List<Integer> paintings, int index, int paintingNumber) {
        if (index >= 0 && index < paintings.size()) {
            paintings.add(index + 1, paintingNumber);
        }
    }

    public static void reversePaintings(List<Integer> paintings) {
        int left = 0;
        int right = paintings.size() - 1;
        while (left < right) {
            int temp = paintings.get(left);
            paintings.set(left, paintings.get(right));
            paintings.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> paintings = new ArrayList<>();

        String[] inputPaintings = scanner.nextLine().split(" ");
        for (String input : inputPaintings) {
            paintings.add(Integer.parseInt(input));
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            }

            String[] tokens = command.split(" ");
            String action = tokens[0];

            switch (action) {
                case "Change" -> {
                    int paintingNumber = Integer.parseInt(tokens[1]);
                    int newNumber = Integer.parseInt(tokens[2]);
                    changePaintings(paintings, paintingNumber, newNumber);
                }
                case "Hide" -> {
                    int hideNumber = Integer.parseInt(tokens[1]);
                    hidePainting(paintings, hideNumber);
                }
                case "Switch" -> {
                    int number1 = Integer.parseInt(tokens[1]);
                    int number2 = Integer.parseInt(tokens[2]);
                    switchPaintings(paintings, number1, number2);
                }
                case "Insert" -> {
                    int index = Integer.parseInt(tokens[1]);
                    int insertNumber = Integer.parseInt(tokens[2]);
                    insertPainting(paintings, index, insertNumber);
                }
                case "Reverse" -> reversePaintings(paintings);
                default -> {
                }
            }
        }

        for (int painting : paintings) {
            System.out.print(painting + " ");
        }
    }
}

