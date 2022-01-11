package OneDArrayRevision;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Syntax: data-type array-name[] = new data-type[size];
         */

        float num[] = new float[10];
        int j = 10;

        num[0] = 2.76f;
        num[6] = 9.16f;

        num[4] = j * 4.12f + num[6];

        /*
        float - 7.14f
        double - 8.17
         */

        System.out.println("Enter a value: ");
        num[7] = scanner.nextFloat();

        int length = num.length;
        System.out.println("Length of the array is: " + length);

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < length; i++) {
            System.out.println(num[i]);
        }
    }
}
