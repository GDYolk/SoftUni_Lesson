package List_Test.Exercise;

import java.util.*;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split(" ", 2);

            if (s[1].equals("is going!")) {
                if(!list.contains(s[0]))
                    list.add(s[0]);
                else System.out.println(s[0] + " is already in the list!");
            } else if (s[1].equals("is not going!")) {
                if (list.contains(s[0]))
                    list.remove(s[0]);
                else System.out.println(s[0] + " is not in the list!");
            }
        }
        for (String s : list)
            System.out.println(s);
    }
}
