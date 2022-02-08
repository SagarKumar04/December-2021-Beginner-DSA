package OOPS.AbstractClasses;

abstract class H {
    abstract void add();
}

class I extends H {
    void add() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println("Sum (in class I): " + sum);
    }
}

class J extends H {
    void add() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;

        System.out.println("Sum (in class J): " + sum);
    }
}

public class AbstractClassExample4 {
    public static void main(String[] args) {
        I i = new I();
        i.add();

        J j = new J();
        j.add();
    }
}
