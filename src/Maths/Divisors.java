package Maths;

public class Divisors {
    private static void getDivisorsByBruteForce(int n) {
        System.out.println("Divisors of " + n + " are (using brute-force approach):");

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void getDivisorsByImprovedApproach(int n) {
        System.out.println("Divisors of " + n + " are (using improved approach):");

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        getDivisorsByBruteForce(10);

        getDivisorsByImprovedApproach(36);
    }
}
