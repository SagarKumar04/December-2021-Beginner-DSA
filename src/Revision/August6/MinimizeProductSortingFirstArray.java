package Revision.August6;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimizeProductSortingFirstArray {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num1[] = new int[n]; //5, 3, 4, 2
        for(int i = 0; i < n; i++) {
            num1[i] = scanner.nextInt();
        }

        int num2[] = new int[n]; //4, 2, 2, 5
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            num2[i] = scanner.nextInt();
            priorityQueue.add(num2[i]);
        }

        Arrays.sort(num1); //2, 3, 4, 5

        int i = n - 1;
        int result = 0;
        while(!priorityQueue.isEmpty()) {
            int first = num1[i];
            int second = priorityQueue.poll();

            int product = first * second;
            result += product;

            i--;
        }

        System.out.println(result);
    }
}
