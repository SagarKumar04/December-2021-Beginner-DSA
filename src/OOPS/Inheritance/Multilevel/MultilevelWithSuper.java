package OOPS.Inheritance.Multilevel;

class A {
    int a;

    A(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.b = b;
    }

    //@Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class C extends B {
    int c;

    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    //@Override
    public String toString() {
        return "C{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class MultilevelWithSuper {
    public static void main(String[] args) {
        A a = new A(1);
        B b = new B(2, 3);
        C c = new C(4, 5, 6);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
