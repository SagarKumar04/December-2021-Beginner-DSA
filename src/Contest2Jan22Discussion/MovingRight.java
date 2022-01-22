package Contest2Jan22Discussion;

import java.util.Scanner;

public class MovingRight {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long height[] = new long[N];
        for(int i = 0; i < N; i++) {
            height[i] = scanner.nextLong();
        }

        int count = 0, maximumCount = 0;
        for(int i = 1; i < N; i++) {
            if(height[i] < height[i - 1]) {
                count = count + 1;
            }
            else {
                count = 0;
            }

            maximumCount = Math.max(count, maximumCount);
        }

        System.out.println(maximumCount);
    }
}
