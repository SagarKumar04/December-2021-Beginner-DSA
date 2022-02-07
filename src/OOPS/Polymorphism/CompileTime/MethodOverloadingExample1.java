package OOPS.Polymorphism.CompileTime;

public class MethodOverloadingExample1 {
    static float test(int b, float a) {
        System.out.println("In test(int, float)");
        return (a + b);
    }

    static float test(float a, int b) {
        System.out.println("In test(float, int)");
        return (a + b);
    }

    public static void main(String[] args) {
        float result;

        /*
        1.14f -> float
        4.76 -> double
         */

        result = test(5, 3.45f);
        System.out.println("Result: " + result);

        result = test(5.64f, 3);
        System.out.println("Result: " + result);
    }
}
