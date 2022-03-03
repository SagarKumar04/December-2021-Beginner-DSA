package Maths;

public class Prime {
    private static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        else if(number == 2) {
            return true;
        }
        else if(number % 2 == 0) {
            return false;
        }
        else {
            int squareRoot = (int)Math.sqrt(number);
            for(int i = 3; i <= squareRoot; i += 2) {
                if(number % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        boolean result;

        result = isPrime(5);
        System.out.println("5: " + result);

        result = isPrime(17);
        System.out.println("17: " + result);

        result = isPrime(51);
        System.out.println("51: " + result);

        result = isPrime(1);
        System.out.println("1: " + result);

        result = isPrime(49);
        System.out.println("49: " + result);

        result = isPrime(3);
        System.out.println("3: " + result);
    }
}
