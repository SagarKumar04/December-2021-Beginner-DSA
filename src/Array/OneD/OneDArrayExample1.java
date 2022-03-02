package Array.OneD;

public class OneDArrayExample1 {
    public static void main(String[] args) {
        /*
        Syntax: data-type array-name[] = new data-type[size];
         */
        float arr[] = new float[5];
        /*
        Since, size of the array is 5,
        the indices will be:
        0, 1, 2, 3, and 4
         */

        /*
        ---------------------
        |0.0|0.0|0.0|0.0|0.0|
        ---------------------
         */
        arr[4] = 28;
        /*
        ---------------------
        |0.0|0.0|0.0|0.0|28.0|
        ---------------------
         */
        arr[1] = 39;
        /*
        ---------------------
        |0.0|39.0|0.0|0.0|28.0|
        ---------------------
         */

        System.out.println("Elements of the array: ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
