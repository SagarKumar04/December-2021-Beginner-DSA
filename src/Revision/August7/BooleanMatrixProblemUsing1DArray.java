package Revision.August7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BooleanMatrixProblemUsing1DArray {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < t; i++) {
            String mAndN = bufferedReader.readLine();
            int m = Integer.parseInt(mAndN.split(" ")[0]);
            int n = Integer.parseInt(mAndN.split(" ")[1]);

            int eachRow[] = new int[n];

            for(int j = 0; j < m; j++) {
                boolean containsOne = false;
                String row = bufferedReader.readLine();
                String rowValues[] = row.split(" ");
                for(int k = 0; k < n; k++) {
                    eachRow[k] = Integer.parseInt(rowValues[k]);

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
