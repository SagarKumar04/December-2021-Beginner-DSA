package Functions.Recursion;

public class Factorial {
    static int getFactorial(int n) {
        int factorial;

        if(n == 1) {
            factorial = 1;
        }
        else {
            factorial = n * getFactorial(n - 1);
        }

        return factorial;
    }
    public static void main(String[] args) {
        int n = 7;
        int factorial = getFactorial(n);
        System.out.println("Factorial: " + factorial);
    }
}
