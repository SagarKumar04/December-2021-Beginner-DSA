package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class GetElement {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int input = (int)(Math.random() * 100);
            numberList.add(input);
        }

        numberList.add(123);
        System.out.println(numberList);

        for(int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
