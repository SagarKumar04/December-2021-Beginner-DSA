package Arrays.NSAssignment;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        num[0] = 1;

        for(int i = 1; i < n; i++) {
            for(int j = num[i - 1] + 1; j < num[i]; j++) {
                if(num[i] % j == 0) {
                    num[i] = j;
                    break;
                }
            }
        }

        String result = "YES";
        for(int i = 1; i < n; i++) {
            if(num[i] <= num[i - 1]) {
                result = "NO";
            }
        }

        System.out.println(result);
    }
}
