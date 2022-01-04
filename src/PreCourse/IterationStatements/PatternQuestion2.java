package PreCourse.IterationStatements;/*
n = 5

* * * * *
* * * *
* * *
* *
*
 */

public class PatternQuestion2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i + 1); j = j + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
