package IterationStatements;/*
n = 5

*
* *
* * *
* * * *
* * * * *
 */

public class PatternQuestion1 {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 1; i <= n; i = i + 1) {
            for(int j = 1; j <= i; j = j + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}