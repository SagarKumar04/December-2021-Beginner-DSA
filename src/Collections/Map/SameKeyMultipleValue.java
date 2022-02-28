package Collections.Map;

import java.util.*;

public class SameKeyMultipleValue {
    public static void main(String[] args) {
        Map<Integer, List<Object>> multipleValueMap
                = new HashMap<Integer, List<Object>>();

        List<Object> temp = new ArrayList<>();
        temp.add("ABC");
        temp.add(1);

        multipleValueMap.put(1, temp);
        multipleValueMap.put(2, Arrays.asList(new Object[]{1.156, 3.14f}));
        multipleValueMap.put(3, Arrays.asList(new Object[]{'c', true}));

        System.out.println(multipleValueMap);

        List<Object> value = multipleValueMap.get(1);
        System.out.println(value);
    }
}
