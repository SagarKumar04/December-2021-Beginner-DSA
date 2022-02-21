package Stack;

import java.util.Stack;

public class InfixToPostfix {
    private static int getPrecedence(char ch) {
        int precedence = 0;

        switch(ch) {
            case '+':
            case '-':
                precedence = 1;
                break;

            case '*':
            case '/':
                precedence = 2;
                break;
        }

        return precedence;
    }

    private static String getPostfixForInfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder("");

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            /*
            if the character is an operand,
            add it to the result
             */
            if(Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            }
            /*
            else if the character is '(',
            push it to stack
             */
            else if(ch == '(') {
                stack.push(ch);
            }
            /*
            else if the character is a ')',
            pop from the stack until an '(' is encountered
             */
            else if(ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                stack.pop();
            }
            /*
            else, an operator is encountered
             */
            else {
                while(!stack.isEmpty()
                   && getPrecedence(stack.peek()) >= getPrecedence(ch)) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "(X-Y/(Z+U)*V)+D*E";
        String postfixExpression = getPostfixForInfix(infixExpression);

        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);
    }
}
