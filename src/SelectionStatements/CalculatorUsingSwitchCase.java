package SelectionStatements;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        /*
        + -> addition
        - -> subtraction
        * -> multiplication
        / -> quotient
        % -> remainder
         */
        System.out.println("Choices are: ");
        System.out.println("Add (press '+')");
        System.out.println("Subtract (press '-')");
        System.out.println("Multiply (press '*')");
        System.out.println("Quotient (press '/')");
        System.out.println("Remainder (press '%')");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter your choice: ");
        char choice = scanner.next().charAt(0);
        int result = 0;
        boolean isValid = true;

        switch(choice) {
            default:
                isValid = false;
                break;

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '.':
            case '*':
                result = num1 * num2;
                break;

            case'/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;
        }

        if(isValid) {
            System.out.println(num1 + " " + choice + " " + num2 + " = " + result);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}