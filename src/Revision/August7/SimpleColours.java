package Revision.August7;

import java.util.Scanner;

public class SimpleColours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long mod = 1000000007;
        long result = k;

        for(int i = 1; i < n; i++) {
            result = result * (k - 1);
            result = result % mod;
        }

        System.out.println(result);
    }
}
