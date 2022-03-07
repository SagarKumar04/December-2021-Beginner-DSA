package Maths.BigInteger;

import java.math.BigInteger;

public class Factorial {
    private static void calculateFactorialOfN(int number) {
        BigInteger factorial = new BigInteger("1");

        for(int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        int number = 100;

        calculateFactorialOfN(number);
    }
}
