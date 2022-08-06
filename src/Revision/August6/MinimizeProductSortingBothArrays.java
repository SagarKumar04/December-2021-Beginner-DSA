package Revision.August6;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeProductSortingBothArrays {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num1[] = new int[n]; //5, 3, 4, 2
        for(int i = 0; i < n; i++) {
            num1[i] = scanner.nextInt();
        }

        int num2[] = new int[n]; //4, 2, 2, 5
        for(int i = 0; i < n; i++) {
            num2[i] = scanner.nextInt();
        }

        Arrays.sort(num1); //2, 3, 4, 5
        Arrays.sort(num2); //2, 2, 4, 5

        int result = 0;
        for(int i = 0; i < n; i++) {
            int sum = num1[i] * num2[n - 1 - i];
            result += sum;
        }

        System.out.println(result);
    }
}
