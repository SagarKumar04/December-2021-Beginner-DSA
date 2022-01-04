package PreCourse.Operators;

public class TypeCastingExample {
    public static void main(String[] args) {
        //Implicit
        int i1 = 10;
        float f1 = i1;
        System.out.println("i1: " + i1);
        System.out.println("f1: " + f1);

        //Explicit
        float f2 = 19.11f;
        int i2 = (int)f2;
        System.out.println("i2: " + i2);
        System.out.println("f2: " + f2);
    }
}
