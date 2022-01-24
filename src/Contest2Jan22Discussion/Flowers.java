package Contest2Jan22Discussion;

import java.util.Scanner;

public class Flowers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalFlowers = 0;
        int minimumNumberOfFlowers = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int numberOfFlowers = scanner.nextInt();

            if(numberOfFlowers % 2 == 0) {
                numberOfFlowers = numberOfFlowers - 1;
            }
            totalFlowers = totalFlowers + numberOfFlowers;

            if(numberOfFlowers < minimumNumberOfFlowers) {
                minimumNumberOfFlowers = numberOfFlowers;
            }
        }

        if(totalFlowers % 2 == 0) {
            totalFlowers = totalFlowers - minimumNumberOfFlowers;
        }

        System.out.println(totalFlowers);
    }
}
