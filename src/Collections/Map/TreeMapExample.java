package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        map.put(111, 1);
        map.put(222, 2);
        map.put(333, 3);
        map.put(444, 4);
        map.put(555, 5);
        map.put(666, 6);
        map.put(777, 7);
        map.put(888, 8);
        map.put(999, 9);
        map.put(1010, 10);
        map.put(160, 16);

        System.out.println(map);
    }
}
