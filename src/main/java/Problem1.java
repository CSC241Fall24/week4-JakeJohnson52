// Problem1.java
import java.util.*;
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        Node a = l2;
        Node last = l1;
        Node temp = l1;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        last.next = a;
        return last;
    }
}
