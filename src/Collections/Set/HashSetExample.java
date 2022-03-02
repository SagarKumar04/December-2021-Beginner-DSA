package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(-20);
        set.add(9);
        set.add(19);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(-10);

        System.out.println("Set: " + set);

        set.add(null);
        set.add(null);
        System.out.println("Set: " + set);
    }
}
