package LinkedList.AssignmentQuestions;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static boolean IsPalindrome(Node head) {
        //enter your code here
        Node temp = head;
        List<Integer> list = new ArrayList<Integer>();

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int size = list.size();
        boolean isPalindrome = true;
        for(int i = 0; i < size; i++) {
            if(list.get(i) != list.get(size - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
