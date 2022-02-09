package OOPS.Interfaces;

interface Constants {
    float PI = 3.14159f;
    float E = 2.718f;
    int SIN90 = 1;
}

public class VariablesInInterfaceExample implements Constants {
    public static void main(String[] args) {
        System.out.println("Pi: " + PI);
        System.out.println("sin 90: " + SIN90);
    }
}
