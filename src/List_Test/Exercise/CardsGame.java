package List_Test.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> cards_1 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> cards_2 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        sc.close();
        cardGame(cards_1, cards_2);
    }
    public static void cardGame(List<Integer> deck1, List<Integer> deck2) {
        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            int card1 = deck1.get(0);
            int card2 = deck2.get(0);

            if (card1 > card2) {
                deck1.add(card1);
                deck1.add(card2);
            } else if (card2 > card1) {
                deck2.add(card2);
                deck2.add(card1);
            }

            // Remove cards if they are equal
            deck1.remove(0);
            deck2.remove(0);
        }

        if (!deck1.isEmpty()) {
            int sum = deck1.stream().mapToInt(Integer::intValue).sum();
            System.out.println("First player wins! Sum: " + sum);
        } else if (!deck2.isEmpty()) {
            int sum = deck2.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
