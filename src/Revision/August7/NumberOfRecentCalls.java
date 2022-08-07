package Revision.August7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfQueries = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numberOfQueries; i++) {
            int time = scanner.nextInt();

            queue.add(time);

            while(queue.peek() < (time - 3000)) {
                queue.poll();
            }

            System.out.print(queue.size() + " ");
        }
    }
}
