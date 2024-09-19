import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        if(head.size() <= position){
            ListNode a = new ListNode(val);
            head.next = a;
        }else{
            ListNode b = new ListNode(val);
            head.insert(position -1, b);
        }
        return head;
    }
}
