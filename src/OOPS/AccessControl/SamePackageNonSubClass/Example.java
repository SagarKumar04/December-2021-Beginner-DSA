package OOPS.AccessControl.SamePackageNonSubClass;

class A {
    int defaultA;
    public float publicB;
    protected double protectedC;
    private String privateD;
}

public class Example {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.defaultA);
        System.out.println(a.publicB);
        System.out.println(a.protectedC);
        /*
        System.out.println(a.privateD);
        'private' access modifier restricts the visibility of any
        member in the sub-class
         */
    }
}
