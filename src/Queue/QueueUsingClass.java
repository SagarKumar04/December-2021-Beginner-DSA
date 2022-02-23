package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean isQueueEmpty;
        int size;
        int removedElement;
        int peekedElement;

        //size
        size = queue.size();
        System.out.println("Size: " + size);

        //isEmpty
        isQueueEmpty = queue.isEmpty();
        System.out.println("Empty?: " + isQueueEmpty);

        //add
        queue.add(10);
        queue.add(-12);

        size = queue.size();
        System.out.println("Size: " + size);

        isQueueEmpty = queue.isEmpty();
        System.out.println("Empty?: " + isQueueEmpty);

        System.out.println("Current Elements in Queue: " + queue);

        //remove
        removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        size = queue.size();
        System.out.println("Size: " + size);

        System.out.println("Current Elements in Queue: " + queue);

        //peek
        peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        System.out.println("Current Elements in Queue: " + queue);

        queue.add(100);
        System.out.println("Current Elements in Queue: " + queue);

        peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);
    }
}