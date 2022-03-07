package Maths.Modulo;

public class Overflow {
    public static void main(String[] args) {
        int minimumValue = Integer.MIN_VALUE;
        int maximumValue = Integer.MAX_VALUE;

        System.out.println("Minimum Value: " + minimumValue);
        System.out.println("Maximum Value: " + maximumValue);

        int i = maximumValue + 1;
        System.out.println("i: " + i);
    }
}
