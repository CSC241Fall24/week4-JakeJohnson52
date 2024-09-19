import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode a = head;
        for(int i = 0; i < position; i++){
            a = a.next;
        }
        if(a.next != null){
            a.next.this.val = val;
        } else{
            a.next.this.val = val;
            while(a.next != null){
                a = a.next;
            }
        }
        return head;
    }
}
