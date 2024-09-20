import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int vall, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode a = head;
        for(int i = 0; i < position; i++){
            a = a.next;
        }
        if(a.next != null){
            ListNode temp = new ListNode(a.next.val);
            a.next = temp;
        } else{
            ListNode temp = new ListNode(a.next.val);
            a.next = temp;
            if(a.next != null)
                temp.next = a.next;
            while(a.next != null){
                a = a.next;
            }
        }
        return a;
    }
}
