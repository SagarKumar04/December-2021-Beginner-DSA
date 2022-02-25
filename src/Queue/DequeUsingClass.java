package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeUsingClass {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();

        //adds an element to the end of the deque
        deque.add(1);
        deque.add(2);
        System.out.println("Deque: " + deque);

        //adds an element to the end of the deque
        deque.addLast(3);
        deque.addLast(4);
        System.out.println("Deque: " + deque);

        deque.addFirst(5);
        deque.addFirst(6);
        System.out.println("Deque: " + deque);

        deque.removeFirst();
        deque.removeFirst();
        System.out.println("Deque: " + deque);

        deque.removeLast();
        deque.removeLast();
        System.out.println("Deque: " + deque);
    }
}
