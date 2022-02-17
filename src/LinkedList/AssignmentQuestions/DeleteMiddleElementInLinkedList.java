package LinkedList.AssignmentQuestions;

public class DeleteMiddleElementInLinkedList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node deleteMiddleElement(Node head) {
        if(head.next==null) {
            head.val = -1;
        }
        else {
            Node slow = head;
            Node fast = head;

            while(fast.next.next != null
                    && fast.next.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node delete = slow.next;
            slow.next = delete.next;
            delete.next = null;
        }

        return head;
    }
}
