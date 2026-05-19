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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode other = head.next;
        ListNode prev = null;
        ListNode newHead = other;
        while( curr != null && other != null){
            ListNode temp = other.next;
            other.next = curr;
            curr.next = temp;
            if(prev != null) {
                prev.next = other;
            }
            prev = curr;
            curr = temp;
            if(curr != null){
                other = curr.next;
            }
            
        }
        return newHead;
    }
}