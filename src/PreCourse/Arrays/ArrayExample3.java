package PreCourse.Arrays;

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {
        int size = 4;
        double array[] = new double[size];

        System.out.println("Please enter " + size + " numbers: ");
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
