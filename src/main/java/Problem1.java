// Problem1.java
import java.util.*;
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode temp = new ListNode();
        while(l1.next != null){
            temp = l1.next;
        }
        while(l2.next != null){
            l1.next = l2.next;
        }
        return l1;
    }
}
