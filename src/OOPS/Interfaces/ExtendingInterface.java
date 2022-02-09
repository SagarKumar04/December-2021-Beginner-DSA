package OOPS.Interfaces;

interface F {
    void method1();
    void method2();
}

interface G extends F {
    void method3();
}

class H implements G {
    public void method1() {
        System.out.println("In method1()");
    }

    public void method2() {
        System.out.println("In method2()");
    }

    public void method3() {
        System.out.println("In method3()");
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {
        H h = new H();
        h.method1();
        h.method2();
        h.method3();
    }
}
