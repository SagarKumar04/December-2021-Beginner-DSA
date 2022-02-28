package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int input = (i + 1) * 100;
            numberList.add(input);
        }

        //[100, 200, 300, 400, 500]
        System.out.println(numberList);

        numberList.set(2, 1000);
        System.out.println(numberList);
    }
}
