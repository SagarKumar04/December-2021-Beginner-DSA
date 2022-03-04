package Maths;

public class EulerTotientFunction {
    private static int calculateGcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return calculateGcd(b, a % b);
    }

    private static void calculatePhiNBruteForce(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++) {
            if(calculateGcd(i, n) == 1) {
                count++;
            }
        }

        System.out.println("Phi(n): " + count);
    }

    private static void calculatePhiNOptimisedApproach(int n) {
        float result = n;

        if(n % 2 == 0) {
            result = result * (1.0f - (1.0f / 2));
        }

        while(n % 2 == 0) {
            n = n / 2;
        }

        for(int p = 3; p * p <= n; p += 2) {
            if(n % p == 0) {
                while(n % p == 0) {
                    n = n / p;
                }

                result = result * (1.0f - (1.0f / p));
            }
        }

        if(n > 1) {
            result = result * (1.0f - (1.0f / n));
        }

        System.out.println("Phi(n): " + result);
    }

    private static void calculatePhiNOptimisedApproachWithoutRoundingError(int n) {
        int result = n;

        if(n % 2 == 0) {
            result = result - (result / 2);
        }

        while(n % 2 == 0) {
            n = n / 2;
        }

        for(int p = 3; p * p <= n; p += 2) {
            if(n % p == 0) {
                while(n % p == 0) {
                    n = n / p;
                }

                result = result - (result / p);
            }
        }

        if(n > 1) {
            result = result - (result / n);
        }

        System.out.println("Phi(n): " + result);
    }

    public static void main(String[] args) {
        calculatePhiNBruteForce(6);

        calculatePhiNOptimisedApproach(12);

        calculatePhiNOptimisedApproachWithoutRoundingError(12);
    }
}
