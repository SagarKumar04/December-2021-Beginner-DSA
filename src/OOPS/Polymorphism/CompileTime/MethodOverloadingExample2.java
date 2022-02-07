package OOPS.Polymorphism.CompileTime;

public class MethodOverloadingExample2 {
    static void test(int a, float b) {
        System.out.println("In test(int, float)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(float a, double b) {
        System.out.println("In test(float, double)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(int a, double b) {
        System.out.println("In test(float, double)");
        System.out.println("a: " + a + " b: " + b);
    }

    static void test(double a, float b) {
        System.out.println("In test(float, double)");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        test(1.34f, 7.12); //yes

        test(1, 1.1f); //yes

        //test(4.555, 6.4f); -> no

        test('a', 'b'); //yes

        //test("a", 'b'); -> no

        test(1, 2);

        test(-1, 2);

        //test(2.34f, 3); -> no, because both options matches
    }
}
