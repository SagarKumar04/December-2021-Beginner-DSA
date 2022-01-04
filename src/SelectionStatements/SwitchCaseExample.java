package SelectionStatements;

public class SwitchCaseExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        //Allowed operators: +, -, *, /, %
        char operator = '-';

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
            case '.':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println("Result: " + result);
    }
}
