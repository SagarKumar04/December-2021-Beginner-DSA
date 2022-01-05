package IterationStatements.While;

/*
Find the sum of digits of a number taken as input from the user.

I/P: 12345
O/P: 15 (= 1 + 2 + 3 + 4 + 5)
 */

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();


        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;

            number = number / 10;
        }

        /*
        int sum = 0;
        for(; number > 0; number = number / 10) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
        }

        System.out.println("Sum: " + sum);
         */
    }
}
