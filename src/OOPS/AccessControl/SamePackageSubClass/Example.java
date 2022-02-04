package OOPS.AccessControl.SamePackageSubClass;

class A {
    int defaultA;
    public float publicB;
    protected double protectedC;
    private String privateD;
}

class B extends A {
    void display() {
        System.out.println(defaultA);
        System.out.println(publicB);
        System.out.println(protectedC);
        /*
        System.out.println(privateD);

        'private' access modifier restricts the visibility of any
        member in the sub-class
         */
    }
}

public class Example {
    public static void main(String[] args) {

    }
}
