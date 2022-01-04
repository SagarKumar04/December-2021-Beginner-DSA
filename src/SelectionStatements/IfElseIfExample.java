package SelectionStatements;

//1. Importing the Scanner class
import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {
        //2. Creating an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        //3. Use appropriate functions of Scanner class
        float num = scanner.nextFloat();

        if(num > 0) {
            System.out.println("Positive Number");
        }
        else if(num < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
