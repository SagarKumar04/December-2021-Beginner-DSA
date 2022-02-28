package Collections.List;

import java.util.*;

public class AddElement {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int input = (int)(Math.random() * 100);
            numberList.add(input);

            System.out.println("Size: " + numberList.size());
            System.out.println("numberList: " + numberList);
        }

        numberList.add(3, 300);
        System.out.println("Size: " + numberList.size());
        System.out.println("numberList: " + numberList);

        numberList.add(6, 700);
        System.out.println("Size: " + numberList.size());
        System.out.println("numberList: " + numberList);
    }
}
