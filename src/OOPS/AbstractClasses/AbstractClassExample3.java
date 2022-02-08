package OOPS.AbstractClasses;

abstract class E {
    abstract void call(int a);
    abstract void callThisToo();

    /*
    abstract E() {

    }
    A constructor cannot be abstract
     */

    void concrete() {
        System.out.println("This is a concrete method.");
    }
}

abstract class F extends E {
    void call(int a) {
        System.out.println("In call() of class F: " + a);
    }
}

class G extends F {
    void callThisToo() {
        System.out.println("In callThisToo() of class G");
    }
}

public class AbstractClassExample3 {
    public static void main(String[] args) {
        G g = new G();
        g.call(18);
        g.callThisToo();
        g.concrete();
    }
}
