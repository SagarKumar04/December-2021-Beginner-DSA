package Collections.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        //add elements
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(5);
        set.add(5);
        set.add(-13);

        System.out.println("Set: " + set);

        //check if the element is there or not
        boolean isPresent = set.contains(0);
        System.out.println("Is 0 present?: " + isPresent);

        isPresent = set.contains(5);
        System.out.println("Is 5 present?: " + isPresent);

        //find position of the element
        int position = 0;
        int target = 5;
        int count = 0;
        for(Integer element : set) {
            count++;
            if(element == target) {
                position = count;
                break;
            }
        }
        if(position > 0) {
            System.out.println("Position of " + target + " is: " + position);
        }
        else {
            System.out.println(target + " not found");
        }

        //removing an element
        set.remove(10);
        System.out.println("Set after removing 10: " + set);

        set.removeAll(Arrays.asList(-13, 20));
        System.out.println("Set after removing -13 and 20: " + set);

        //add multiple elements
        set.addAll(Arrays.asList(200, 100, 300));
        System.out.println("Set: " + set);

        //clear
        set.clear();
        System.out.println("Set: " + set);

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(2, 1, 5, 3, 4));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        boolean isEqual12 = set1.equals(set2);
        System.out.println("Is set1 and set2 equal: " + isEqual12);

        set.addAll(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8));
        System.out.println("Set: " + set);

        set.retainAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Set: " + set);

        set.add(null);
        System.out.println("Set: " + set);
    }
}
