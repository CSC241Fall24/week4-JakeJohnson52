import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode a = new ListNode(val);
        if(position < 0){
            head.next = a;
            return head;
        }
        ListNode b = head;
        int index = 0;
        while(b != null && index < position - 1){
            b = b.next;
            index++;
        }
        if(b != null){
            a.next = b.next;
            b.next = a;
        } else b.next = a;
        return a;
    }
}
