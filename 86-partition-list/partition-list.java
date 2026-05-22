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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode tail = left;
        ListNode right = new ListNode(0);
        ListNode tail2 = right;
        while(head != null){
            if(x > head.val){
                tail.next = head;
                tail = tail.next;
            }else{
                tail2.next = head;
                tail2 = tail2.next;
            }
            head = head.next;
        }
        tail2.next = null;
        tail.next = right.next;
        return left.next; 
    }
}