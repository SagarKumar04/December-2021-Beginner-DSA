package OOPS.ClassInitializers;

import java.util.Scanner;

public class StaticInitializer1 {
    static int array[] = new int[5];

    //static initializer
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In static initializer");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.println("In main() function");

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
