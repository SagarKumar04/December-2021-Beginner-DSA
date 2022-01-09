package Arrays.NSAssignment;

import java.util.Scanner;

public class SimpleArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(num[num[i]] + " ");
        }
    }
}
