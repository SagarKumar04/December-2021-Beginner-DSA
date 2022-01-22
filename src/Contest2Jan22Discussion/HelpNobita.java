package Contest2Jan22Discussion;

import java.util.Scanner;

public class HelpNobita {
    static int getGcd(int num1, int num2) {
        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int remainder = num2 % num1;
        while(remainder != 0) {
            num2 = num1;
            num1 = remainder;
            remainder = num2 % num1;
        }

        return num1;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();

        int gcd = getGcd(X, Y);

        if(N % gcd == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
