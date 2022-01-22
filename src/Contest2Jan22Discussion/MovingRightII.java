package Contest2Jan22Discussion;

import java.util.Scanner;

public class MovingRightII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0, maximumCount = 0;
        int previousHeight;
        int currentHeight = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            previousHeight = currentHeight;
            currentHeight = scanner.nextInt();

            if(currentHeight < previousHeight) {
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
