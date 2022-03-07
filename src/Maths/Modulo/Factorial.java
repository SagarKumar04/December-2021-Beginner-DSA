package Maths.Modulo;

public class Factorial {
    final static int modulo = (int)(1e9 + 7);

    private static void calculateFactorialOfN(int n) {
        int calculatedNumber = 1;
        int finalNumber = 1;

        for(int i = 1; i <= n; i++) {
            calculatedNumber = (calculatedNumber % modulo) * (i % modulo);
            finalNumber = calculatedNumber % modulo;

            System.out.println("i: " + i);
            System.out.println("Calculated: " + calculatedNumber);
            System.out.println("Final: " + finalNumber);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 15;

        calculateFactorialOfN(number);

        System.out.println(modulo);
    }
}
