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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = head;
        dummy.next = temp;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        temp = dummy;
        int mid = count / 2;
        int c = 0;
        
        while(c < mid) {
            temp = temp.next;
            c++;
        }
        
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        
        return dummy.next;
        }
}