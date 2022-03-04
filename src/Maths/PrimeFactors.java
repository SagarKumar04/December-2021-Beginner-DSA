package Maths;

public class PrimeFactors {
    private static void printPrimeFactors(int n) {
        //part 1 - even composite numbers
        while(n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        //part 2 - odd composite numbers
        for(int i = 3; i * i <= n; i += 2) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        //part 3 - prime numbers only
        if(n > 2) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printPrimeFactors(25);
    }
}
