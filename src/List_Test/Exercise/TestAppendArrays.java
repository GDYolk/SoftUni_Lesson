package List_Test.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAppendArrays {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Collections.singleton("abcdef"));

        System.out.print("Output:   ");
        AnonymousThreat.divide(input, 0, 3);
    }
}
