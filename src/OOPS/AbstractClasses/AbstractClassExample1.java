package OOPS.AbstractClasses;

abstract class A {
    abstract void call(int a);
}

class B extends A {
    void call(int a) {
        System.out.println("In call(), in class B: " + a);
    }
}

public class AbstractClassExample1 {
    public static void main(String[] args) {
        B b = new B();
        b.call(12);
    }
}
