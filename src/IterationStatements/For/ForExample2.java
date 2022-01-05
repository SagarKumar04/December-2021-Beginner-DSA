package IterationStatements.For;

public class ForExample2 {
    public static void main(String[] args) {
        int sum, i;
        sum = i = 0;

        for(; i < 10; ) {
            sum = sum + i;
            System.out.println(sum);

            i++;
        }
    }
}
