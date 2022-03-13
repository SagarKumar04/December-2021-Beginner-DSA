package Maths.CatalanNumbers;

public class DynamicProgrammingApproachOptimised {
    static int numberOfTerms;
    static int catalanNumbers[];

    private static void calculateNCatalanNumbers(int numberOfTerms) {
        catalanNumbers[0] = 1;
        catalanNumbers[1] = 1;

        for(int i = 2; i < numberOfTerms; i++) {
            for(int j = 0; j < i; j++) {
                catalanNumbers[i] = catalanNumbers[i]
                        + (
                                catalanNumbers[j]
                              * catalanNumbers[i - j - 1]
                        );
            }
        }
    }

    private static void printNCatalanNumbers() {
        for(int i = 0; i < numberOfTerms; i++) {
            System.out.print(catalanNumbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numberOfTerms = 10;
        catalanNumbers = new int[numberOfTerms + 2];

        calculateNCatalanNumbers(numberOfTerms);
        printNCatalanNumbers();
    }
}
