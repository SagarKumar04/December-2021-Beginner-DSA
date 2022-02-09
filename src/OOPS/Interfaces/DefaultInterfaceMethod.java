package OOPS.Interfaces;

interface I {
    public void display();

    default void show() {
        System.out.println("In default method of interface");
    }
}

class J implements I {
    public void display() {
        System.out.println("In display() in class J");
    }
}

public class DefaultInterfaceMethod {
    public static void main(String[] args) {
        J j = new J();
        j.show();
        j.display();
    }
}
