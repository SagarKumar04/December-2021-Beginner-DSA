package Array.TwoD;

public class TwoDArrayExample1 {
    public static void main(String[] args) {
        /*
        Syntax:
        data-type array-name[][] = new data-type[row-size][column-size];
         */
        int arr[][] = new int[3][6];

        arr[1][4] = 19;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                arr[i][j] = ((i + 1) * (j + 1));
            }
        }

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
