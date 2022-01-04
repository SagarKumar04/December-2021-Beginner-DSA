package PreCourse.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 13;

        boolean condition1;
        boolean condition2;
        boolean result;

        condition1 = (num1 > num2);
        condition2 = (num1 != (num2 + 6));

        result = (condition1 && condition2);
        System.out.println("'&&' Result: " + result);

        result = (condition1 || condition2);
        System.out.println("'||' Result: " + result);

        result = !(condition1);
        System.out.println("'!' Result: " + result);
    }
}
