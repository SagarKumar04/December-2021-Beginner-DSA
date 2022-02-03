package OOPS.Inheritance.Multilevel;

class D {
    int i;

    D(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "D{" +
                "i=" + i +
                '}';
    }
}

class E extends D {
    int i;

    public E(int i, int i1) {
        super(i);
        super.i = i;
        this.i = i1;
    }

    @Override
    public String toString() {
        return "E{" +
                "i=" + super.i +
                ", i=" + i +
                '}';
    }
}

class F extends E {
    int i;

    public F(int i, int i1, int i2) {
        super(i, i1);
        super.i = i1;
        this.i = i2;
    }

    @Override
    public String toString() {
        return "F{" +
                "i=" + super.i +
                ", i=" + i +
                ", i=" + i +
                '}';
    }
}

public class MultilevelWithSameVariableName {
    public static void main(String[] args) {
        D d = new D(1);
        E e = new E(2, 3);
        F f = new F(4, 5, 6);

        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
}
