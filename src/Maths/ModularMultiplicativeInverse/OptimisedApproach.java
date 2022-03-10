package Maths.ModularMultiplicativeInverse;

public class OptimisedApproach {
    private static int findModularMultiplicativeInverse(int a, int m) {
        int originalM = m;
        int x = 1;
        int y = 0;

        while(a > 1) {
            int q = a / m;

            int temp = m;

            int r = a % m;
            m = r;
            /*
            Combining the above two statements:
            m = a % m;
             */
            a = temp;

            temp = y;
            y = x - q * y;
            x = temp;
        }

        if(x < 0) {
            x = x + originalM;
        }

        return x;
    }

    public static void main(String[] args) {
        int a = 17;
        int m = 43;
        int x = findModularMultiplicativeInverse(a, m);

        System.out.println("x: " + x);
    }
}
