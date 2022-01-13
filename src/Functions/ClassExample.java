package Functions;

public class ClassExample {
    int num1; //non-static member (variable)
    static float num2; //static member (variable)
    float sum; //non-static member (variable)

    public static void main(String[] args) {
        num2 = 10;

        /*
        Creating an object of the class:
        class-name object-name = new class-name();
         */
        ClassExample classExample = new ClassExample();
        classExample.num1 = 10;

        classExample.sum = classExample.num1 + num2;

        System.out.println("Sum: " + classExample.sum);
    }
}
