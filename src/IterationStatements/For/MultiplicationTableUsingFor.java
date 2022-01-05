package IterationStatements.For;

import java.util.Scanner;

public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication table of " + num + ": ");
        for(int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " * " + i + " = " + product);
        }
    }
}
