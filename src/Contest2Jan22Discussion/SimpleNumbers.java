package Contest2Jan22Discussion;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();
        long K = scanner.nextLong();
        long count = 0;

        count = L / K;
        if(L % K == 0) {
            count--;
        }
        count = (R / K) - count;

        System.out.println(count);
    }
}
