package Maths.ChineseRemainderTheorem;

public class BruteForceApproach {
    private static int findMinimumX(int num[], int rem[]) {
        int x = 1;

        while(true) {
            int i;
            for(i = 0; i < num.length; i++) {
                if(x % num[i] != rem[i]) {
                    break;
                }
            }

            if(i == num.length) {
                return x;
            }

            x++;
        }
    }

    public static void main(String[] args) {
        int num[] = {3, 4, 5};
        int rem[] = {2, 3, 1};

        int x = findMinimumX(num, rem);
        System.out.println("x: " + x);
    }
}
