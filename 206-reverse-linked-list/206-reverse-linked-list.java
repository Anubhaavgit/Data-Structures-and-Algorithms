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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode prev=null;
        ListNode q=head.next;
        while(head.next!=null)
        {
            head.next=prev;
            prev=head;
            head=q;
            q=q.next;
        }
        head.next=prev;
        return head;
    }
}