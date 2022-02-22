package Queue;

public class QueueUsingArray {
    int front;
    int rear;
    int capacity;
    int queue[];

    QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];

        front = -1;
        rear = -1;
    }

    //isEmpty
    private boolean isEmpty() {
        if(rear == -1 || front > rear) {
            return true;
        }
        return false;
    }

    //isFull
    private boolean isFull() {
        if(rear == (capacity - 1)) {
            return true;
        }
        return false;
    }

    //traverse
    private void traverse() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            for(int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    //insert
    private void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full.");
        }
        else {
            //first element
            if(isEmpty()) {
                front = 0;
            }
            //subsequent elements
            rear = rear + 1;
            queue[rear] = data;
        }
    }

    //delete
    private void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            front = front + 1;
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray
                = new QueueUsingArray(6);

        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(20);
        queueUsingArray.enqueue(30);
        queueUsingArray.traverse();

        queueUsingArray.dequeue();
        queueUsingArray.dequeue();
        queueUsingArray.traverse();

        queueUsingArray.enqueue(40);
        queueUsingArray.enqueue(50);
        queueUsingArray.enqueue(60);
        queueUsingArray.enqueue(70);
        queueUsingArray.traverse();
    }
}
