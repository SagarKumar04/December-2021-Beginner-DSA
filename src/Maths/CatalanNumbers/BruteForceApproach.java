package Maths.CatalanNumbers;

public class BruteForceApproach {
    private static int getNthCatalanNumber(int n) {
        int nthCatalanNumber = 0;
        if(n <= 1) {
            nthCatalanNumber = 1;
        }
        else {
            for(int i = 0; i < n; i++) {
                nthCatalanNumber
                        = nthCatalanNumber
                        + (
                                getNthCatalanNumber(i)
                              * getNthCatalanNumber(n - i - 1)
                );
            }
        }

        return nthCatalanNumber;
    }

    public static void main(String[] args) {
        int numberOfTerms = 10;

        for(int i = 0; i < numberOfTerms; i++) {
            int nthCatalanNumber = getNthCatalanNumber(i);
            System.out.print(nthCatalanNumber + " ");
        }
    }
}
