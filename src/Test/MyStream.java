package Test;

import java.util.ArrayList;
import java.util.List;

public class MyStream {
    private final List<Integer> list;

    public MyStream(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    MyStream filter (int n) {
        List<Integer> filterList = new ArrayList<>();

        for (int item : getList())
            if (item > n)
                filterList.add(item);

        return new MyStream(filterList);
    }

    private int sum() {
        int sum = 0;
        for (int item : getList()) {
            sum += item;
        }
        return sum;
    }

    public static void main(String[] args) {
        MyStream myStream = new MyStream(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum1 = myStream.filter(5).sum();
        int sum2 = myStream.filter(3).sum();
        System.out.println("sum = " + sum1 + " " + sum2);
    }
}
