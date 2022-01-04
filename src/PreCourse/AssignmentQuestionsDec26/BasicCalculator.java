package PreCourse.AssignmentQuestionsDec26;

/*
URL: https://my.newtonschool.co/playground/code/bo7m02d90n77/
 */

public class BasicCalculator {
    static int calculator(char ch, int a, int b) {
        int result = 0;

        if(ch == '+') {
            result = a + b;
        }
        else if(ch == '-') {
            result = a - b;
        }
        else if(ch == '*') {
            result = a * b;
        }
        else {
            result = a / b;
        }

        return result;
    }

    public static void main(String[] args) {
        calculator('*', 10, 5);
    }
}
