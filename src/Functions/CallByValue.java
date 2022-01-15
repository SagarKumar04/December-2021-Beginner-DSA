package Functions;

public class CallByValue {
    static void swap(int num1, int num2) {
        System.out.println("Before swapping in swap(): ");
        System.out.println("num1: " + num1 + " num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping in swap(): ");
        System.out.println("num1: " + num1 + " num2: " + num2);
    }

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 48;

        System.out.println("Before calling swap(): ");
        System.out.println("num1: " + num1 + " num2: " + num2);

        swap(num1, num2);

        System.out.println("After calling swap(): ");
        System.out.println("num1: " + num1 + " num2: " + num2);
    }
}
