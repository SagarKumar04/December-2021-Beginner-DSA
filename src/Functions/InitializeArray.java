package Functions;

public class InitializeArray {
    static int arr[];

    static void initializeArray() {
        arr = new int[10];
    }

    public static void main(String[] args) {
        initializeArray();
        System.out.println(arr.length);
    }
}
