package Functions;

/*
Take two numbers as input from the user.
Add the numbers.
Then, find out if the sum is an even number or an odd number.
 */

import java.util.Scanner;

public class SumAndEvenOdd1 {
    static void findOddOrEven(int num) {
        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static int findSum(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = findSum(num1, num2);

        findOddOrEven(sum);
    }
}
