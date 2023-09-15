package ObjectsAndClasses;

import java.util.*;
import java.util.stream.Collectors;

class RandomizeWords {
    Random random = new Random();
    List<String> input;
    List<String> output = new ArrayList<>();
    public RandomizeWords(List<String> input) {
        this.input = input;
    }

    public void setRandom(){
        while (input.size() > 0) {
            int index = random.nextInt(input.size());

            if (index < input.size()) {
                output.add(input.get(index));
                input.remove(index);
            }
        }
        for (String s : output) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.<String>toList());

        new RandomizeWords(words).setRandom();
    }
}
