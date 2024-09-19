// Problem1.java
import java.util.*;
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        for(int i = 0; i < l2.size(); i++){    
            ListNode temp = new ListNode(l2.get(i));
            l1.next() = temp;
        }
        return l1;
    }
}
