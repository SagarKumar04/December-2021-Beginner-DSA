package Maths.Modulo.Exponentiation;

public class APowerB {
    private static int optimisedRecursive(int a, int b) {
        int result;
        if(b == 0) {
            result = 1;
        }
        else {
            if(b % 2 == 0) {
                result = optimisedRecursive(a, b/2);
                result = result * result;
            }
            else {
                result = optimisedRecursive(a, (b - 1) / 2);
                result = a * result * result;
            }
        }
        return result;
    }

    private static int bruteForceRecursive(int a, int b) {
        int result;
        if(b == 0) {
            result = 1;
        }
        else {
            result = a * bruteForceRecursive(a, b - 1);
        }
        return result;
    }

    private static int bruteForceIterative(int a, int b) {
        int result = 1;
        for(int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        double result;

        if(b >= 0) {
            result = bruteForceIterative(a, b);
        }
        else {
            result = 1.0 / bruteForceIterative(a, -b);
        }
        System.out.println("Brute-Force (Iterative): " + result);

        if(b >= 0) {
            result = bruteForceRecursive(a, b);
        }
        else {
            result = 1.0 / bruteForceRecursive(a, -b);
        }
        System.out.println("Brute-Force (Recursive): " + result);

        if(b >= 0) {
            result = optimisedRecursive(a, b);
        }
        else {
            result = 1.0 / optimisedRecursive(a, -b);
        }
        System.out.println("Optimised (Recursive): " + result);
    }
}
