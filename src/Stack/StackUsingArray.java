package Stack;

public class StackUsingArray {
    private int stack[];
    private int maxCapacity;
    private int top;

    StackUsingArray(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        stack = new int[maxCapacity];
        top = -1;
    }

    //isEmpty
    private boolean isEmpty() {
        return (top == -1);
    }

    //isFull
    private boolean isFull() {
        return (top == (maxCapacity - 1));
    }

    //push
    private void push(int element) {
        if(isFull()) {
            System.out.println("Stack is full.");
        }
        else {
            //top = top + 1;
            stack[++top] = element;
        }
    }

    //pop
    private void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            System.out.println("Popped element is: " + stack[top]);
            top--;
        }
    }

    //peek
    private void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            System.out.println("Element at top: " + stack[top]);
        }
    }

    //traverse
    private void traverse() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            System.out.println("Current Stack:");
            for(int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray
                = new StackUsingArray(5);

        stackUsingArray.push(5);
        stackUsingArray.traverse();

        stackUsingArray.push(-10);
        stackUsingArray.traverse();

        stackUsingArray.push(18);
        stackUsingArray.traverse();

        stackUsingArray.push(7);
        stackUsingArray.traverse();

        stackUsingArray.push(10);
        stackUsingArray.traverse();

        stackUsingArray.push(100);
        stackUsingArray.traverse();

        stackUsingArray.pop();
        stackUsingArray.traverse();

        stackUsingArray.push(100);
        stackUsingArray.traverse();

        stackUsingArray.peek();
        stackUsingArray.traverse();
    }
}
