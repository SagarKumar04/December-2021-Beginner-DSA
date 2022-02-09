package OOPS.Interfaces;

interface A {
    final static int a = 10;
    final static float b = 10.14f;

    public abstract void f1();
    public abstract void f2();
}

class B implements A {
    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void f1() {
        System.out.println("In f1() of class B");
    }

    public void f2() {
        System.out.println("In f2() of class B");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        B b = new B();
        b.f1();
        b.f2();

        b.display();
    }
}
