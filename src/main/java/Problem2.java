import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode temp = head;
        ListNode a = head;
        int count = 0;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        if(position > count){
            head.next = new ListNode(val);
            return head;
        }else {
            for(int i = 0; i < position; i++){
                a = a.next;
            }
            ListNode b = new ListNode(val);
            a.next = b;
            b.next = a.next.next;
            return head;
        }
        
        
    }       
}
