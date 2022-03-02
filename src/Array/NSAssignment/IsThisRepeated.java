package Array.NSAssignment;

import java.util.Scanner;

public class IsThisRepeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        String result = "No";
        for(int i = 0; i <= (n - 3); i++) {
            if(num[i] == num[i + 1]
                    && num[i + 1] == num[i + 2]) {
                result = "Yes";
                break;
            }
        }

        System.out.println(result);
    }
}
