package String;

import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = scanner.next();
        System.out.println("Enter second string: ");
        String s2 = scanner.next();
        System.out.println("Enter third string: ");
        String s3 = scanner.next();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        scanner.nextLine();

        System.out.println("Enter fourth string: ");
        String s4 = scanner.nextLine();
        System.out.println("Enter five string: ");
        String s5 = scanner.nextLine();

        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
    }
}
