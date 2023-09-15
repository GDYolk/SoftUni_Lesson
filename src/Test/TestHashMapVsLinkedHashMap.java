package Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapVsLinkedHashMap {
    public static void main(String[] args) {
        hashMapTest();
    }
    private static void hashMapTest(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("c", 1);
        hashMap.put("d", 1);
        hashMap.put("c", hashMap.get("c") + 1);

        printMap(hashMap);
    }
    private static void printMap(Map<String, Integer> hashMap){
        for (String s : hashMap.keySet()) {
            System.out.printf("%s%n", s);
        }
    }
}
/* HashMap Test: 1

input example:
        hashMap.put("a", 1);
        hashMap.put("b", 1);
        hashMap.put("c", 1);
        hashMap.put("d", 1);
output:
        a
        b
        c
        d
 */