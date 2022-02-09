package OOPS.Interfaces;

interface C {
    void f1();
    void f2();
}

abstract class D implements C {
    public void f1() {
        System.out.println("In f1()");
    }
}

class E extends D {
    public void f2() {
        System.out.println("In f2()");
    }
}

public class PartialImplementation {
    public static void main(String[] args) {
        E e = new E();
        e.f1();
        e.f2();
    }
}
