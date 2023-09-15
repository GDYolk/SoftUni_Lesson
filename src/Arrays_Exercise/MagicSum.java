package Arrays_Exercise;

import java.util.*;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int targetSum = Integer.parseInt(sc.nextLine());

        List<Integer> sortArray = new ArrayList<>();
        for (int sort : array)
                sortArray.add(sort);
        //1 7 6 2 19 23
        //8

        //14 20 60 13 7 19 8
        //27

        for (int i = 0; i < sortArray.size()-1; i++)
            for (int j = i+1; j <sortArray.size() ; j++) {
                if (targetSum - sortArray.get(i) == sortArray.get(j)) {
                    System.out.println(sortArray.get(i) + " " + sortArray.get(j));
                    sortArray.remove(j);
                    break;
                }
            }
    }
}
