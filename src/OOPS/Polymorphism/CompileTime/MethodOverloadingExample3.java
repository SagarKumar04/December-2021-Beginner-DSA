package OOPS.Polymorphism.CompileTime;

public class MethodOverloadingExample3 {
    static void test(float a, double b) {
        System.out.println("In test(float, double)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(double a, float b) {
        System.out.println("In test(double, float)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(float a, int b) {
        System.out.println("In test(float, int)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(int a, float b) {
        System.out.println("In test(int, float)");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        //test(1, 2); -> no, because both options matches

        //test(1, 1); -> no, because both options matches
    }
}
