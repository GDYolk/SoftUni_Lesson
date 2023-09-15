package List_Test.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = Arrays.stream(
                sc.nextLine().split(" "))
                .map(String::trim)
                .collect(Collectors.<String>toList());

        while (true) {
            String[] line = sc.nextLine().split(" ");

            if (line[0].equals("3:1")) break;

            int index1 = Integer.parseInt(line[1]);
            int index2 = Integer.parseInt(line[2]);

            if ("merge".equals(line[0])) {
                merge(names, index1, index2);
            } else if ("divide".equals(line[0])) {
                divide(names, index1, index2);
            }
        }
        System.out.println(names.toString().replaceAll("[\\[\\],]", ""));
    }
    private static void merge(List<String> names, int startIndex, int endIndex) {
        StringBuilder merge = new StringBuilder();
        int start = Math.max(0, Math.min(startIndex, names.size()-1));
        int end = Math.max(0, Math.min(endIndex, names.size()-1));

        for (; start <= end; start++) {
            merge.append(names.get(start));
        }
        names.subList(Math.max(0, Math.min(startIndex, names.size()-1)),
                Math.max(0, Math.min(endIndex, names.size()-1))).clear();

        if (!names.isEmpty())
            names.set(Math.max(0, Math.min(startIndex, names.size()-1)),
                    String.valueOf(merge));
        else
            names.add(String.valueOf(merge));
    }

    public static void divide(List<String> names, int divideIndex, int divide ) {

        List<String> stringList = Arrays.stream(names.get(divideIndex).split("")).collect(Collectors.<String>toList());
        int p = stringList.size() / divide;
        List<String> addList = new ArrayList<>();
        int count = 1;

        while (count < divide) {
            StringBuilder stringBuilder = new StringBuilder();
            int index = 0;
            while (index < p) {
                stringBuilder.append(stringList.get(index));
                index++;
            }
            stringList.subList(0, index).clear();
            addList.add(String.valueOf(stringBuilder));
            count++;
        }

        //
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stringList)
            stringBuilder.append(s);
        addList.add(String.valueOf(stringBuilder));
        names.remove(divideIndex);
        names.addAll(divideIndex, addList);
    }
}
