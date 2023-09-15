package List_Test;

import java.util.*;

public class ListOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        Collections.sort(list);

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + list.get(i-1));
        }
    }
}
