package OOPS.AccessControl.SameClass;

public class Example {
    static int defaultA;
    static public float publicB;
    static protected double protectedC;
    static private String privateD;

    public static void main(String[] args) {
        defaultA = 10;
        publicB = 1.12f;
        protectedC = 4.23;
        privateD = "Test";

        System.out.println(defaultA);
        System.out.println(publicB);
        System.out.println(protectedC);
        System.out.println(privateD);
    }
}
