/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = l1;
        ListNode dummy2 = l2;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry = 0;
        while(dummy1 != null && dummy2 != null){
            int sum = dummy1.val + dummy2.val + carry;
            carry = sum/10;
            sum = sum%10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }
        while(dummy1 != null){
            int sum = dummy1.val + carry;
            carry = sum/10;
            sum = sum%10;
            
            curr.next = new ListNode(sum);
            dummy1 = dummy1.next;
            curr = curr.next;
        }
        while(dummy2 != null){
            int sum = dummy2.val + carry;
            carry = sum/10;
            sum = sum%10;

            curr.next = new ListNode(sum);
            dummy2 = dummy2.next;
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return res.next;
    }
}