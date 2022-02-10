package OOPS.Interfaces;

interface L {
    default void show() {
        System.out.println("default() method of interface L");
    }
}

interface M {
    default void show() {
        System.out.println("default() method of interface M");
    }
}

class N implements L, M {
    public void show() {
        L.super.show(); //calls show() of interface L
        M.super.show(); //calls show() of interface M
    }
}

public class Example {
    public static void main(String[] args) {
        N n = new N();

        n.show();
    }
}
