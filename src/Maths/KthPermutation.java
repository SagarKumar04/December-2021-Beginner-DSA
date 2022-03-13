package Maths;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public static String getPermutation(int n, int k) {
        StringBuilder resultString = new StringBuilder();
        List<Integer> numberList = new ArrayList<Integer>();
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            numberList.add(i);

            factorial = factorial * i;
        }

        int l = k - 1;
        for(int i = 0; i < n; i++) {
            factorial = factorial / (n - i);
            int index = l / factorial;
            String number = String.valueOf(numberList.get(index));
            numberList.remove(index);
            resultString.append(number);
            l = l - (index * factorial);
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        String result = getPermutation(4, 17);
        System.out.println(result);
    }
}
