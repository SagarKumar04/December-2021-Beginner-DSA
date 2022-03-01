package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("AAA", 1);
        map.put("BBB", 2);
        map.put("CCC", 3);
        map.put("DDD", 4);
        map.put("EEE", 5);
        map.put("FFF", 6);
        map.put("GGG", 7);
        map.put("HHH", 8);
        map.put("III", 9);
        map.put("JJJ", 10);
        map.put("KKK", 11);
        map.put("LLL", 12);
        map.put("MMM", 13);
        map.put("Aa", 123);
        map.put("BB", 456);

        int value;
        value = map.get("AAA");
        value = map.get("Aa");
        value = map.get("BB");

        System.out.println(map);
    }
}
