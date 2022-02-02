package OOPS.Inheritance;

class A {
    int i, j;

    void showIj() {
        System.out.println("i: " + i + " j: " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        A a = new A();
        a.i = 1;
        a.j = 2;
        a.showIj();

        B b = new B();
        b.i = 10;
        b.j = 20;
        b.k = 30;
        b.showIj();
        b.showK();
    }
}
