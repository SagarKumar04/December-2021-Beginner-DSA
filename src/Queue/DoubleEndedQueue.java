package Queue;

public class DoubleEndedQueue {
    int deque[];
    int front;
    int rear;
    int size;

    DoubleEndedQueue(int size) {
        this.size = size;
        deque = new int[size];

        front = -1;
        rear = -1;
    }

    private void printArray() {
        System.out.print("Current Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(deque[i] + " ");
        }
        System.out.println();
    }

    private boolean isFull() {
        return (
                (front == 0 && rear == (size - 1))
                || (front == rear + 1)
        );
    }

    private boolean isEmpty() {
        return (front == -1);
    }

    private void traverse() {
        //empty queue
        if(front == -1) {
            System.out.println("Queue is empty.");
        }
        else if(front <= rear) {
            System.out.print("Current Deque: ");
            for(int i = front; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.print("Current Deque: ");
            for(int i = front; i < size; i++) {
                System.out.print(deque[i] + " ");
            }
            for(int i = 0; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
            System.out.println();
        }
    }

    //insert at 'front'
    private void insertAtFront(int data) {
        if(isFull()) {
            System.out.println("Queue is full.");
        }
        else {
            //first element of the deque
            if(front == -1) {
                front = 0;
                rear = 0;
            }
            else if(front == 0) {
                front = size - 1;
            }
            else {
                front = front - 1;
            }
            deque[front] = data;
        }
    }

    //insert at 'rear'
    private void insertAtRear(int data) {
        if(isFull()) {
            System.out.println("Queue is full.");
        }
        else {
            //first element of the deque
            if(front == -1) {
                front = 0;
                rear = 0;
            }
            else if(rear == (size - 1)) {
                rear = 0;
            }
            else {
                rear = rear + 1;
            }
            deque[rear] = data;
        }
    }

    //delete from 'front'
    private void deleteFromFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            //if deque has only one element
            if(front == rear) {
                front = -1;
                rear = -1;
            }
            else if(front == (size - 1)) {
                front = 0;
            }
            else {
                front = front + 1;
            }
        }
    }

    //delete from 'rear'
    private void deleteFromRear() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            //if deque has only one element
            if(front == rear) {
                front = -1;
                rear = -1;
            }
            else if(rear == 0) {
                rear = size - 1;
            }
            else {
                rear = rear - 1;
            }
        }
    }

    public static void main(String[] args) {
        DoubleEndedQueue doubleEndedQueue
                = new DoubleEndedQueue(6);

        doubleEndedQueue.insertAtFront(1);
        doubleEndedQueue.insertAtFront(2);
        doubleEndedQueue.traverse();
        doubleEndedQueue.printArray();
        System.out.println("front: " + doubleEndedQueue.front);
        System.out.println("rear: " + doubleEndedQueue.rear);

        doubleEndedQueue.insertAtRear(3);
        doubleEndedQueue.insertAtRear(4);
        doubleEndedQueue.traverse();
        doubleEndedQueue.printArray();
        System.out.println("front: " + doubleEndedQueue.front);
        System.out.println("rear: " + doubleEndedQueue.rear);

        doubleEndedQueue.deleteFromFront();
        doubleEndedQueue.deleteFromRear();
        doubleEndedQueue.traverse();
        doubleEndedQueue.printArray();
        System.out.println("front: " + doubleEndedQueue.front);
        System.out.println("rear: " + doubleEndedQueue.rear);

        doubleEndedQueue.deleteFromFront();
        doubleEndedQueue.deleteFromRear();
        doubleEndedQueue.traverse();
        doubleEndedQueue.printArray();
        System.out.println("front: " + doubleEndedQueue.front);
        System.out.println("rear: " + doubleEndedQueue.rear);
    }
}
