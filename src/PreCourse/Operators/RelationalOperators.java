package PreCourse.Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 13;

        boolean result;

        result = (num1 > num2);
        System.out.println("19 > 13: " + result);

        result = ((num1 - 6) >= num2);
        System.out.println("(19 - 6) >= 13: " + result);

        result = (num1 != (num2 + 6));
        System.out.println("19 != (13 + 6): " + result);

        result = (num1 == num2);
        System.out.println("19 == 13: " + result);
    }
}
