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
        StringBuilder num1 = new StringBuilder("");
        StringBuilder num2 = new StringBuilder("");
        while(l1 != null){
            num1.append(l1.val);
            l1 = l1.next;
        }
        num1 = num1.reverse();
        while(l2 != null){
            num2.append(l2.val);
            l2 = l2.next;
        }
        num2 = num2.reverse();
        BigInteger n1 = num1.length() == 0 ? BigInteger.ZERO : new BigInteger(num1.toString());
        BigInteger n2 = num2.length() == 0 ? BigInteger.ZERO : new BigInteger(num2.toString());
        BigInteger res = n1.add(n2);
        if(res.equals(BigInteger.ZERO)) return new ListNode(0);
        Stack<Integer> result  = new Stack<>();
        while(res.compareTo(BigInteger.ZERO) > 0){
            result.push(res.mod(BigInteger.TEN).intValue());
            res = res.divide(BigInteger.TEN);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!result.isEmpty()) {
            ListNode node = new ListNode(result.pop());
            node.next = curr.next;
            curr.next = node;
        }
        return dummy.next;
    }
}