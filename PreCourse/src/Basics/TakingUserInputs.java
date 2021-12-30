package Basics;//Step 1
import java.util.Scanner;

public class TakingUserInputs {
    public static void main(String[] args) {
        //Step 2
        Scanner scanner = new Scanner(System.in);

        //Step 3
        System.out.println("Enter a value: ");

        System.out.println("Byte:");
        byte numByte = scanner.nextByte();

        System.out.println("Short:");
        short numShort = scanner.nextShort();

        System.out.println("Integer:");
        int numInt = scanner.nextInt();

        System.out.println("Long:");
        long numLong = scanner.nextLong();

        System.out.println("Float:");
        float numFloat = scanner.nextFloat();

        System.out.println("Double:");
        double numDouble = scanner.nextDouble();

        System.out.println("Character:");
        char charValue = scanner.next().charAt(0);

        System.out.println("Boolean:");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Integer: " + numInt);
        System.out.println("Long: " + numLong);
        System.out.println("Float: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);
    }
}
