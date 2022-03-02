package Array.NSAssignment;

import java.util.Scanner;

public class Buildings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];

        for(int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int count = 1;
        int maxHeight = height[0];

        for(int i = 1; i < n; i++) {
            if(height[i] > maxHeight) {
                count = count + 1;
                maxHeight = height[i];
            }
        }

        System.out.println(count);
    }
}
