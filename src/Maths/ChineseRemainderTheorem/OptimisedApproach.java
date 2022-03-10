package Maths.ChineseRemainderTheorem;

public class OptimisedApproach {
    private static int getModularMultiplicativeInverse(int a, int m) {
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

    private static int findMinimumX(int num[], int rem[]) {
        int length = num.length;
        int product = 1;
        int productByNumI;
        int inverse;

        for(int i = 0; i < length; i++) {
            product = product * num[i];
        }

        int minimumX = 0;
        for(int i = 0; i < length; i++) {
            productByNumI = product / num[i];
            inverse = getModularMultiplicativeInverse(productByNumI, num[i]);

            minimumX = minimumX + (rem[i] * productByNumI * inverse);
        }

        minimumX = minimumX % product;

        return minimumX;
    }

    public static void main(String[] args) {
        int num[] = {3, 4, 5};
        int rem[] = {2, 3, 1};

        int minimumX = findMinimumX(num, rem);

        System.out.println("Minimum X: " + minimumX);
    }
}
