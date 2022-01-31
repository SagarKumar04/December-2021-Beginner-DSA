package String.StringBuffer;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();

        System.out.println("Reverse: " + stringBuffer);
    }
}
