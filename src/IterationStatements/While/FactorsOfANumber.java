package IterationStatements.While;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Divisors of " + num + " are: ");
        int divisor = 1;
        while(divisor <= num) {
            if(num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
