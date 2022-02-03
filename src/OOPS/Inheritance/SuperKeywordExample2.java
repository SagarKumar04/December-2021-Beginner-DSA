package OOPS.Inheritance;

class G {
    int i;

    void displayG() {
        System.out.println("In class G");
        System.out.println("i: " + i);
        System.out.println("-----");
    }
}

class H extends G {
    int i;

    void displayH() {
        System.out.println("In class H");
        System.out.println("super.i: " + super.i);
        System.out.println("i: " + i);
        System.out.println("-----");
    }

    H(int a, int b) {
        super.i = a; //refers to the variable 'i' of super class, i.e., G
        i = b; //refers to the variable 'i' of sub class, i.e., H
    }
}

public class SuperKeywordExample2 {
    public static void main(String[] args) {
        G g = new G();
        g.displayG();

        H h = new H(1, 2);
        h.displayG();
        h.displayH();
    }
}