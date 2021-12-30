package Basics;//Step 1
import java.util.Scanner;

public class AddingTwoNumbersWithUserInput {
    public static void main(String[] args) {
        //Step 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        //Step 3
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);
    }
}
