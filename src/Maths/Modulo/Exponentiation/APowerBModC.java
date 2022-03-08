package Maths.Modulo.Exponentiation;

public class APowerBModC {
    final static int modulo = (int)(1e9 + 7);

    private static int calculateAPowerBModC(int a, int b) {
        int result;
        if(b == 0) {
            result = 1;
        }
        else {
            if(b % 2 == 0) {
                result = calculateAPowerBModC(a, b/2);
                result = ((result % modulo) * (result % modulo)) % modulo;
            }
            else {
                result = calculateAPowerBModC(a, (b - 1) / 2);
                result = a * (((result % modulo) * (result % modulo)) % modulo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a;
        int b;
    }
}
