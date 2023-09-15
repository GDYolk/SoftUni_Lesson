package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//1 2 3 4 5 6 7 8 9
/*  Test 1

        For time:   1625238300.
        Stream time: 721523600.

        *********** Stream ***********
        1 2 3 4 5 6 7 8 9
        *********** For ***********
        1 2 3 4 5 6 7 8 9

        ForLambda time: 2815100.
        ForEach time:   7877700.

 */
/*Test 2

        For time:   -1657912400.
        Stream time: -775907000.

        *********** Stream ***********
        1 2 3 4 5 6 7 8 9
        *********** For ***********
        1 2 3 4 5 6 7 8 9

        ForLambda time: 3132300.
        ForEach time: 9241600.

 */
/*
        Stream time: 2025301700.
        For time:      866571600.

        *********** Stream ***********
        1 2 3 4 5 6 7 8 9
        *********** For ***********
        1 2 3 4 5 6 7 8 9

        ForLambda time: 3803700.
        ForEach time:   8034100.

 */
public class TestListInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //-------------------
        long startStream = System.nanoTime();
        List<Integer> stringList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        long endStream = System.nanoTime();

        //-------------
        long startFor = System.nanoTime();
        String[] targetsInput = scanner.nextLine().split(" ");
        List<Integer> targets = new ArrayList<>();
        for (String target : targetsInput) {
            targets.add(Integer.parseInt(target));
        }
        long endFor = System.nanoTime();

        //------------------------
        System.out.printf("Stream time: %d.%n For time: %d.%n%n",
                endStream - startStream, endFor - startFor);

        System.out.println("*********** Stream ***********");
        long startForEachLambda = System.nanoTime();
        stringList.forEach(item -> System.out.print(item + " "));
        long endForEachLambda = System.nanoTime();

        System.out.println();
        System.out.println("*********** For ***********");
        long startForEach = System.nanoTime();
        for (int item : targets)
            System.out.print(item + " ");
        long endForEach = System.nanoTime();


        System.out.println();
        System.out.printf("ForLambda time: %d.%n ForEach time: %d.%n%n",
                endForEachLambda - startForEachLambda, endForEach - startForEach);
    }
}
