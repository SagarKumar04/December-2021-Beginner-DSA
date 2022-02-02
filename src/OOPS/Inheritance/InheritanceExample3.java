package OOPS.Inheritance;

class E {
    int e1;
    int e2;
    int e3;
    int e4;

    E(int a, int b, int c, int d) {
        e1 = a;
        e2 = b;
        e3 = c;
        e4 = d;
    }

    void displayE() {
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
        System.out.println("----------");
    }
}

class F extends E {
    int f1;
    int f2;
    int f3;

    F(int a, int b, int c, int d, int e, int f, int g) {
        super(a, b, c, d);
        f1 = e;
        f2 = f;
        f3 = g;
    }

    void displayF() {
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("----------");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        E e = new E(10, 20, 30, 40);
        e.displayE();

        F f = new F(1, 2, 3, 4, 5, 6, 7);
        f.displayE();
        f.displayF();
    }
}
