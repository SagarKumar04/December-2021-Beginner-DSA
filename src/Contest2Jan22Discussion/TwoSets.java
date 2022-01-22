package Contest2Jan22Discussion;

import java.util.Scanner;

public class TwoSets {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result;
        /*
        Method 1:
        int sum = N * (N + 1) / 2;
        result = sum % 2;
        */

        if(N % 4 == 1 || N % 4 == 2) {
            result = 1;
        }
        else {
            result = 0;
        }
        System.out.println(result);
    }
}
