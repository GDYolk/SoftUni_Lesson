package List_Test.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(
                sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.parseInt(sc.nextLine());
        while (true) {
            String[] line = sc.nextLine().split(" ");
            if (line[0].equals("end"))break;
            if (line[0].equals("Add"))
                list.add(Integer.parseInt(line[1]));
            else setWagonMaxPeople(list, max, Integer.parseInt(line[0]));
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]",""));
    }
    private static void setWagonMaxPeople(List<Integer> list, int maxPeople, int addPeople) {
        for (int item = 0; item < list.size(); item++) {
            int n = list.get(item) + addPeople;
            if ( n <= maxPeople) {
                list.set(item, n);
                break;
            }
        }
    }
}
