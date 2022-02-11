package LinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //traversing the list
    private void traverse() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                /*
                System.out.println("data: " + temp.data);
                System.out.println("current node address: " + temp);
                System.out.println("next node address: " + temp.next);
                System.out.println("-------------");
                 */
                temp = temp.next;
            }
            System.out.println();
        }
    }

    //insert the new node at the end of the linked list
    private void push(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.traverse();

        singlyLinkedList.push(8);
        singlyLinkedList.push(-10);
        singlyLinkedList.push(20);

        singlyLinkedList.traverse();
    }
}
