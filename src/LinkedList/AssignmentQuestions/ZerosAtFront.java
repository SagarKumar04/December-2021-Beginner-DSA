package LinkedList.AssignmentQuestions;

import java.util.ArrayList;
import java.util.List;

public class ZerosAtFront {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static public Node moveZeroes(Node head) {
        // Your code here
        int zeroCount = 0;
        List<Integer> nonZeroList = new ArrayList<Integer>();

        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                zeroCount++;
            }
            else {
                nonZeroList.add(temp.data);
            }
            temp = temp.next;
        }

        temp = head;
        while(zeroCount > 0) {
            temp.data = 0;
            temp = temp.next;
            zeroCount--;
        }

        int listIndex = 0;
        while(temp != null) {
            temp.data = nonZeroList.get(listIndex);
            listIndex++;
            temp = temp.next;
        }

        return head;
    }
}
