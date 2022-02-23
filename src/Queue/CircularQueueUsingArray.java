package Queue;

public class CircularQueueUsingArray {
    int front;
    int rear;
    int size;
    int circularQueue[];

    CircularQueueUsingArray(int size) {
        this.size = size;
        circularQueue = new int[size];
        front = -1;
        rear = -1;
    }

    //traverse
    private void traverse() {
        //empty queue
        if(front == -1) {
            System.out.println("Queue is empty.");
        }
        else if(front <= rear) {
            for(int i = front; i <= rear; i++) {
                System.out.print(circularQueue[i] + " ");
            }
            System.out.println();
        }
        else {
            for(int i = front; i < size; i++) {
                System.out.print(circularQueue[i] + " ");
            }
            for(int i = 0; i <= rear; i++) {
                System.out.print(circularQueue[i] + " ");
            }
            System.out.println();
        }
    }

    //enqueue
    private void enqueue(int data) {
        //check if queue is full
        if((front == 0 && (rear == size - 1))
        || (rear == front - 1)) {
            System.out.println("Queue is full.");
        }
        //check if queue is empty
        else if(front == -1) {
            front = 0;
            rear = 0;
            circularQueue[rear] = data;
        }
        //empty places at the start of the queue
        else if(rear == size - 1 && front != 0) {
            rear = 0;
            circularQueue[rear] = data;
        }
        //empty places at the end of the queue
        else {
            rear = rear + 1;
            circularQueue[rear] = data;
        }
    }

    //dequeue
    private void dequeue() {
        //empty queue
        if(front == -1) {
            System.out.println("Queue is empty");
        }
        //queue contains only one element
        else if(front == rear) {
            front = -1;
            rear = -1;
        }
        //'front' is at the last index
        else if(front == size - 1) {
            front = 0;
        }
        //'front' is at some other index
        else {
            front = front + 1;
        }

        /*
        the above two conditions can be combined into one
        by using the below expression for calculating the value
        of 'front':
        front = (front + 1) % size;
         */
    }

    public static void main(String[] args) {
        CircularQueueUsingArray circularQueueUsingArray
                = new CircularQueueUsingArray(6);

        circularQueueUsingArray.enqueue(1);
        circularQueueUsingArray.enqueue(2);
        circularQueueUsingArray.enqueue(3);
        circularQueueUsingArray.enqueue(4);
        circularQueueUsingArray.traverse();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();

        circularQueueUsingArray.enqueue(5);
        circularQueueUsingArray.enqueue(6);
        circularQueueUsingArray.enqueue(7);
        circularQueueUsingArray.traverse();

        circularQueueUsingArray.enqueue(8);
        circularQueueUsingArray.enqueue(9);
        circularQueueUsingArray.traverse();
    }
}
