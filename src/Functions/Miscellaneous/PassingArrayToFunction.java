package Functions.Miscellaneous;

public class PassingArrayToFunction {
    static void displayArray(int a[]) {
        System.out.println("Elements of the array: ");
        System.out.println("displayArray(): ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < a.length; i++) {
            a[i] = a[i] + 10;
        }
    }

    public static void main(String[] args) {
        int arr[] = {91, 37, 100, 49, 11};

        displayArray(arr);

        System.out.println("Elements of the array: ");
        System.out.println("main(): ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
