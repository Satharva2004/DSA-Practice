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
    public ListNode find(ListNode head, int pos) {
    ListNode curr = head;
        for (int i = 1; i < pos; i++) {
            curr = curr.next;
        }
    return curr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k%len == 0) return head;
        k = k%len;
        tail.next = head;
        int find = len;
        ListNode newLastNode = find(head, len-k);
        ListNode newHead = newLastNode.next;
        newLastNode.next = null;
        return newHead;
    }
}