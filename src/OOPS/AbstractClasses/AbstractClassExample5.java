package OOPS.AbstractClasses;

abstract class K {
    abstract void show();

    void display() {
        System.out.println("In display().");
    }
}

class L extends K {
    void show() {
        System.out.println("In show().");
    }
}

public class AbstractClassExample5 {
    public static void main(String[] args) {
        /*
        K k = new K();
        Abstract class cannot be instantiated.
         */
    }
}
