package Functions.Miscellaneous;

public class ReturningArrayInFunction {
    static int[] getArray() {
        int a[] = {91, 37, 100, 49, 11};

        return a;
    }
    public static void main(String[] args) {
        int arr[] = getArray();

        System.out.println("Returned Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
