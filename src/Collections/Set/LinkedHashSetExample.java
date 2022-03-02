package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        set.add(-12);
        set.add(-21);
        set.add(0);
        set.add(-120);
        set.add(10);
        set.add(38);
        set.add(27);
        set.add(27);
        set.add(null);

        System.out.println("Set: " + set);
    }
}
