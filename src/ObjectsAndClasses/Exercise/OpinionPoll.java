package ObjectsAndClasses.Exercise;

import java.util.*;

public class OpinionPoll {

    public List<List<String>> list = new ArrayList<>();

    public List<List<String>> getList() {
        return list;
    }
    public void setList(List<String> list) {
       this.list.add(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        OpinionPoll opinionPoll = new OpinionPoll();
        for (int i = 0; i < n; i++) {
            List<String> person = Arrays.asList(scanner.nextLine().split(" "));
            opinionPoll.setList(person);
        }

        opinionPoll.list.forEach(poll -> {
            if (Integer.parseInt(poll.get(1)) >= 30) {
                System.out.printf("%s - %s%n", poll.get(0), poll.get(1));
            }
        });
    }
}
