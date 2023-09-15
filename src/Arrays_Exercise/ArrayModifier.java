package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String until = "";
        while (!until.equals("end")) {
            until = sc.nextLine();
            String[] swap = until.split(" ");
            int firstIndex, secondIndex, temp;

            switch (swap[0]) {
                case "decrease":
                    for (int i = 0; i < array.length; i++)
                        array[i] -= 1;
                    break;
                case "swap":
                    firstIndex = Integer.parseInt(swap[1]);
                    secondIndex = Integer.parseInt(swap[2]);
                    temp = array[firstIndex];
                    array[firstIndex] = array[secondIndex];
                    array[secondIndex] = temp;
                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(swap[1]);
                    secondIndex = Integer.parseInt(swap[2]);
                    array[firstIndex] *= array[secondIndex];
                    break;
            }
        }
        String[] value = new String[array.length];

        for (int i = 0; i < value.length; i++) {
            value[i] = String.valueOf(array[i]);
        }
        System.out.println(String.join(", ", value));
    }
}
