package Functions;

public class AddNumbers {
    static int add4(int n1, int n2) {
        int sum = n1 + n2;

        return sum;
    }

    static int add3() {
        int num1 = 14;
        int num2 = 11;

        int sum = num1 + num2;

        return sum;
    }

    static void add2(int n1, int n2) {
        int sum = n1 + n2;

        System.out.println("Sum 2: " + sum);
    }

    static void add1() {
        int num1 = 10;
        int num2 = 18;
        int sum = num1 + num2;

        System.out.println("Sum 1: " + sum);
    }

    public static void main(String[] args) {
        add1();

        add2(5, 9);

        int sum3 = add3();
        System.out.println("Sum 3: " + sum3);

        int sum4 = add4(100, 212);
        System.out.println("Sum 4: " + sum4);
    }
}
