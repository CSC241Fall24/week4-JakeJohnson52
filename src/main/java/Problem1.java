// Problem1.java
import java.util.*;
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if(l1 == null) l1 = l2;
        else {
            ListNode temp = l1;
            while(l1.next != null){
                temp = temp.next;
            }
            temp.next = l2;
        }
        return l1;
    }
}
