package SelectionStatements;

//1. Importing the Scanner class
import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        //2. Creating an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        //3. Use appropriate functions of Scanner class
        int num = scanner.nextInt();

        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println("Even Positive Number");
            }
            else {
                System.out.println("Odd Positive Number");
            }
        }
        else if(num < 0) {
            if(num % 2 == 0) {
                System.out.println("Even Negative Number");
            }
            else {
                System.out.println("Odd Negative Number");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}
