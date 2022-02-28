package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneAMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jahid", 100);
        map.put("Nicky", 90);
        map.put("Sagar", 50);
        map.put("Asif", 100);
        map.put("Rasika", 99);
        System.out.println("Original Map: " + map);

        Map<String, Integer> clonedMap = new HashMap<String, Integer>(map);
        System.out.println("Cloned Map: " + clonedMap);
    }
}
