package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//put(), containsKey(), get(), remove(), and size()
public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        boolean isPresent;
        int value;

        //creates a key-value pair
        map.put("Jahid", 100);
        map.put("Asif", 95);
        map.put("Nicky", 90);
        map.put("Sagar", 50);
        map.put("Asif", 100);

        System.out.println("HashMap: " + map);

        //checking if the specified key is present in the map or not
        isPresent = map.containsKey("Asif");
        System.out.println("Is Present?: " + isPresent);
        value = map.get("Asif");
        System.out.println("Value: " + value);

        isPresent = map.containsKey("Shivam");
        System.out.println("Is Present?: " + isPresent);
        if(isPresent) {
            value = map.get("Shivam");
            System.out.println("Value: " + value);
        }

        map.put("Rasika", 88);
        System.out.println("HashMap: " + map);
        map.put("Rasika", 99);
        System.out.println("HashMap: " + map);

        map.remove("Rasika");
        System.out.println("HashMap: " + map);

        System.out.println("Size: " + map.size());
    }
}
