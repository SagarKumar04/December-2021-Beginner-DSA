package PreCourse.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, finalValue = 0;

        if(num1 > 10) {
            finalValue = num1;
        }
        else {
            finalValue = num2;
        }
        System.out.println("Final Value (using if-else): " + finalValue);

        finalValue = (num1 > 10) ? num1 : num2;
        System.out.println("Final Value (using ternary): " + finalValue);
    }
}
