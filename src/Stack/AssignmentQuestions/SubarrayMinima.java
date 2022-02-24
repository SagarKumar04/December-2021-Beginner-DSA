package Stack.AssignmentQuestions;

import java.util.Scanner;
import java.util.Stack;

public class SubarrayMinima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long arr[] = new long[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextLong();
        }

        Stack<Integer> stack = new Stack<Integer>();

        long left[] = new long[N];
        long right[] = new long[N];

        for(int i = 0; i < N; i++) {
            left[i] = i + 1;
            right[i] = N - i;
        }

        //previous less element
        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                left[i] = i - stack.peek();
            }
            stack.push(i);
        }

        //next less element
        stack.clear();

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                right[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        long result = 0;
        for(int i = 0; i < N; i++) {
            result = result + (arr[i] * left[i] * right[i]);
        }

        System.out.println(result);
    }
}
