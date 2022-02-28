package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetValueWithKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();
        map.put("Jahid", 100);
        map.put("Nicky", 90);
        map.put("Sagar", 50);
        map.put("Asif", 100);
        map.put("Rasika", 99);

        System.out.println(map);
        System.out.println(map.entrySet());

        for(Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() == 100) {
                list.add(eachEntry.getKey());
            }
        }

        System.out.println(list);
    }
}
