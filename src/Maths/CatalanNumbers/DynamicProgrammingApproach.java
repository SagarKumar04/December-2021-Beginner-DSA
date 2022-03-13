package Maths.CatalanNumbers;

public class DynamicProgrammingApproach {
    private static int getNthCatalanNumber(int n) {
        int catalanNumbers[] = new int[n + 2];

        catalanNumbers[0] = 1;
        catalanNumbers[1] = 1;

        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                catalanNumbers[i] = catalanNumbers[i]
                        + (catalanNumbers[j] * catalanNumbers[i - j - 1]);
            }
        }

        return catalanNumbers[n];
    }

    public static void main(String[] args) {
        int numberOfTerms = 10;

        for(int i = 0; i < numberOfTerms; i++) {
            int nthCatalanNumber = getNthCatalanNumber(i);
            System.out.print(nthCatalanNumber + " ");
        }
    }
}
