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
            a.next.val = vall;
        } else{
            a.next.val = vall;
            while(a.next != null){
                a = a.next;
            }
        }
        return head;
    }
}
