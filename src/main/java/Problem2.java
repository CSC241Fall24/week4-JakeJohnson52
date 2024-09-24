import java.util.*;
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        if(position == 1){
            ListNode c = new ListNode(val);
            c.next = head;
            return c;
        }
        ListNode temp = head;
        ListNode a = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        if(position > count){
            ListNode d = new ListNode(val);
            ListNode e = head;
            while(e.next != null){
                e = e.next;
            }
            e.next = d;
            return e;
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
