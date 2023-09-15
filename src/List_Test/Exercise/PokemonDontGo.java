package List_Test.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    static int sumElement = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(
                scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!sequence.isEmpty()){
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < sequence.size()) {
                int element = sequence.remove(index);
                modifySequence(sequence, element);

            } else if (index > sequence.size() - 1) {
                int firstElement = sequence.get(0);
                int lastElement = sequence.remove(sequence.size()-1);

                removeLastElement(sequence,firstElement, lastElement);
            } else {
                int lastElement = sequence.get(sequence.size()-1);
                int firstElement = sequence.remove(0);

                removeFirstElement(sequence,firstElement, lastElement);
            }
        }
        System.out.print(sumElement);
    }

    private static void removeFirstElement(List<Integer> sequence, int firstElement, int lastElement) {
        sequence.add(0, lastElement);
        modifySequence(sequence, firstElement);
    }

    private static void removeLastElement(List<Integer> sequence, int firstElement, int lastElement) {
        sequence.add(firstElement);
        modifySequence(sequence, lastElement);
    }

    private static void modifySequence(List<Integer> sequence, int element) {
        sumElement += element;
        sequence.replaceAll(num -> num <= element ? num + element : num - element);
    }


}
