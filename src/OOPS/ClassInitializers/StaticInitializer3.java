package OOPS.ClassInitializers;

import java.util.Scanner;

public class StaticInitializer3 {
    //static initializer
    static {
        int array[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("In static initializer");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

    }
}
