package OOPS.AbstractClasses;

abstract class C {
    abstract void call(int a);
    /*
    abstract static void test();
    'abstract' and 'static' are illegal combination
     */

    void callThisToo() {
        System.out.println("This is a concrete method in an abstract class");
    }
}

class D extends C {
    void call(int a) {
        System.out.println("In call(), in class D: " + a);
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        D d = new D();
        d.call(19);
        d.callThisToo();
    }
}
