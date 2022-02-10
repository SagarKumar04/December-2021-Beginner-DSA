package OOPS.Interfaces;

interface K {
    int a = 10;

    public void show();

    default void display() {
        System.out.println("In display()");
    }

    public static void print() {
        System.out.println("In print()");
    }
}

public class AccessingWithoutImplementing {
    public static void main(String[] args) {
        System.out.println(K.a);

        K k = new K() {
            public void show() {
                System.out.println("In show()");
            }

            public void display() {
                System.out.println("In display() in main()");
            }
        };

        k.show();
        k.display();
        K.print();
    }
}
