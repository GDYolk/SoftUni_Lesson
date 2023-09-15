package TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers {
    private static final List<Integer> bigLetters = arrayCreate(65, 90);
    private static final List<Integer> litterLetters = arrayCreate(97, 122);
    private static int high, low;

    public static List<Integer> getBigLetters() {return bigLetters;}

    public static List<Integer> getLitterLetters() {
        return litterLetters;
    }

    public static void setHigh(int high) {
        LettersChangeNumbers.high = high;
    }

    public static void setLow(int low) {
        LettersChangeNumbers.low = low;
    }

    public static int getHigh() {
        return high;
    }

    public static int getLow() {
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // NBTL -> numberBetweenTwoLetters
        String[] NBTL = sc.nextLine().split("\\s+");

        double sum = 0;
        for (String s : NBTL) {
            sum += tendency(s);
        }

        System.out.printf("%.2f", sum);
    }
    private static List<Integer> arrayCreate(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            list.add(i);
        }
        return list;
    }

    private static double tendency(String s) {
        char firstLetter = s.charAt(0);
        char secondLetter = s.charAt(s.length()-1);
        double number = Integer.parseInt(s.substring(1, s.length()-1));

        double p1 = checkFirstLetter(firstLetter, number);

        return checkSecondLetter(secondLetter, p1);
    }
    private static double checkSecondLetter(char letter, double p1){
        if (Character.isUpperCase(letter)) {
            return  p1 - interpolationSearch(getBigLetters(),letter);
        }else {
            return p1 + interpolationSearch(getLitterLetters(),letter);
        }
    }
    private static double checkFirstLetter(char letter, double number){
        if (Character.isUpperCase(letter)) {
            return  number / interpolationSearch(getBigLetters(),letter);
        }else {
            return number * interpolationSearch(getLitterLetters(), letter);
        }
    }
    private static int interpolationSearch(List<Integer> list, char letter) {
        setHigh(list.size()-1);
        setLow(0);
        while ((int) letter >= list.get(getLow()) &&
                (int) letter <= list.get(getHigh()) && getLow() <= getHigh())   {

            int probe = low + (getHigh() - getLow()) * ((int) letter - list.get(getLow())) /
                    (list.get(getHigh()) - list.get(getLow()));

            if (list.get(probe) == (int) letter)
                return probe + 1;
            else if (list.get(probe) < (int) letter)
                setLow(probe + 1);
            else setHigh(probe - 1);
        }
        return -1;
    }
}
