
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class lc_21_Merge_Two_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int i, int i1, int i2) {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null&& l2 !=null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;

            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;

    }


    public static void main(String[] args){
        ListNode l1 = new ListNode(1,2,4);
        ListNode l2 = new ListNode(1,3,4);
        System.out.println(list.mergeTwoLists(l1,l2));

    }
}
