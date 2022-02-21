package Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        int poppedElement;
        int peekedElement;
        int searchResult;

        //pop
        if(integerStack.isEmpty()) {
            System.out.println("Empty stack");
        }
        else {
            poppedElement = integerStack.pop();
            System.out.println("Popped Element: " + poppedElement);
        }

        //push
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println("Current Stack: " + integerStack);

        integerStack.push(3);
        integerStack.push(-10);
        integerStack.push(0);
        System.out.println("Current Stack: " + integerStack);

        //pop
        poppedElement = integerStack.pop();
        System.out.println("Popped Element: " + poppedElement);

        //peek
        peekedElement = integerStack.peek();
        System.out.println("Peeked Element: " + peekedElement);
        System.out.println("Current Stack: " + integerStack);

        //search
        searchResult = integerStack.search(3);
        System.out.println("Search Result: " + searchResult);
        searchResult = integerStack.search(-10);
        System.out.println("Search Result: " + searchResult);
        searchResult = integerStack.search(13);
        System.out.println("Search Result: " + searchResult);
    }
}
