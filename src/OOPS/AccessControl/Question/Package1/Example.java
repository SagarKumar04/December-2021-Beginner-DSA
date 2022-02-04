package OOPS.AccessControl.Question.Package1;

class A {
    int defaultA;
    public float publicB;
    protected double protectedC;
    private String privateD;
}

public class Example extends A {
    void display() {
        System.out.println(defaultA);
        System.out.println(publicB);
        System.out.println(protectedC);
        //System.out.println(privateD);
    }

    public static void main(String[] args) {

    }
}
