package Maths;

public class GreatestCommonDivisor {
    private static int getGcdUsingSubtraction(int a, int b) {
        if(a == 0) {
            return b;
        }
        if(b == 0) {
            return a;
        }
        if(a == b) {
            return a;
        }
        if(a > b) {
            return getGcdUsingSubtraction(a - b, b);
        }
        return getGcdUsingSubtraction(a, b - a);
    }

    private static int getGcdUsingModulo(int a, int b) {
        if(b == 0) {
            return a;
        }

        return getGcdUsingModulo(b, a % b);
    }

    public static void main(String[] args) {
        int gcd;

        gcd = getGcdUsingSubtraction(36, 48);
        System.out.println("GCD (36, 48): " + gcd);

        gcd = getGcdUsingModulo(36, 48);
        System.out.println("GCD (36, 48): " + gcd);
    }
}
