package Functions;

import java.util.Scanner;

public class SumAndEvenOdd2 {
    static void findOddOrEven(int num) {
        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static void findSum(int num1, int num2) {
        int sum = num1 + num2;

        findOddOrEven(sum);
    }

    static void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        findSum(num1, num2);
    }

    public static void main(String[] args) {
        takeInput();
    }
}
