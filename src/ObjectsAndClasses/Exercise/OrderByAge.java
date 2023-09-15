package ObjectsAndClasses.Exercise;

import java.util.*;

public class OrderByAge {
    // People field
    private final String name;
    private final int id;
    private final int age;

    public OrderByAge(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderByAge> human = new ArrayList<>();
        while (true) {
            String[] array = scanner.nextLine().split(" ");
            if (Objects.equals(array[0], "End")) break;

            OrderByAge orderByAge = new OrderByAge(array[0],
                    Integer.parseInt(array[1]), Integer.parseInt(array[2]));

            human.add(orderByAge);
        }
        sortAge(human);
        printOrderByAge(human);
    }

    private static void printOrderByAge(List<OrderByAge> human) {
        for (OrderByAge order : human) {
            System.out.printf("%s with ID: %d is %d years old.%n",
                    order.getName(),
                    order.getId(),
                    order.getAge());
        }
    }

    public static void sortAge(List<OrderByAge> orderByAgeList) {
        for (int i = 0; i < orderByAgeList.size()-1; i++) {
            if (orderByAgeList.get(i).getAge() >= orderByAgeList.get(i+1).getAge() ) {
                Collections.swap(orderByAgeList, i + 1, i);
                i = -1;
            }
        }
    }
}
