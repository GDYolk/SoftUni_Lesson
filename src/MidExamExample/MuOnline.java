package MidExamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MuOnline {
    static int currentHealth = 100;
    static int bitcoins = 0;
    static int count = 0;

    public static void main(String[] args) {
        String[] strings = new Scanner(System.in).nextLine().split("\\|");
        List<List<String>> lists = new ArrayList<>();

        for (String s : strings) {
            String[] list = s.split(" ");

            lists.add(List.of(list));
        }

        for (List<String> s : lists) {
            int number = Integer.parseInt(s.get(1));
            count++;
            if ("potion".equals(s.get(0))) {
                potion(number);
            } else if ("chest".equals(s.get(0))) {
                chest(number);
            } else {
                gameStartFight(s.get(0), number);

                if (currentHealth <= 0)  break;
            }
        }

        if (currentHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", currentHealth);
        }
    }

    private static void gameStartFight(String s, int number) {
        currentHealth -= number;

        if (currentHealth > 0) {
            System.out.printf("You slayed %s.%n", s);
        } else {
            System.out.printf("You died! killed by %s.%n", s);
            System.out.printf("Best room: %d%n", count);
        }
    }

    private static void chest(int number) {
        bitcoins += number;
        System.out.printf("You found %d bitcoins.%n", number);
    }

    private static void potion(int addHealth) {
        int health = currentHealth + addHealth;

        if (health > 100) {
            health = addHealth - (health - 100);
        } else {
            health = addHealth;
        }

        System.out.printf("You healed for %d hp.%n", health);
        currentHealth += health;
        System.out.printf("Current health: %d hp.%n",currentHealth);

    }
}
