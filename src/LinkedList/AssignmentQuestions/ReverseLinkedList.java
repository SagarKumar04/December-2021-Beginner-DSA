package LinkedList.AssignmentQuestions;

public class ReverseLinkedList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node ReverseLinkedList(Node head) {
        // return the head of the modified linked list
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while(currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;

        return head;
    }
}
