package Maths.ModularMultiplicativeInverse;

public class BruteForceApproach {
    private static int findModularMultiplicativeInverse(int a, int m) {
        for(int i = 1; i < m; i++) {
            if((a * i) % m == 1) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int a = 17;
        int m = 43;
        int x = findModularMultiplicativeInverse(a, m);

        if(x > 0) {
            System.out.println("Result: " + x);
        }
        else {
            System.out.println("Not found");
        }
    }
}