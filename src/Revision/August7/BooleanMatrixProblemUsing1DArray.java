package Revision.August7;

import java.util.Scanner;

public class BooleanMatrixProblemUsing1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int eachRow[] = new int[n];

            for(int j = 0; j < m; j++) {
                boolean containsOne = false;
                for(int k = 0; k < n; k++) {
                    eachRow[k] = scanner.nextInt();

                    if(eachRow[k] == 1) {
                        containsOne = true;
                    }
                }
                if(containsOne) {
                    for(int k = 0; k < n; k++) {
                        System.out.print("1 ");
                    }
                }
                else {
                    for(int k = 0; k < n; k++) {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}
