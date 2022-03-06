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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null||head.next==null||k==0)
           return head;
        
      ListNode p=head;
      int count=1;
       while(p.next!=null)
       {
           count++;
           p=p.next;
       }
        k=k%count;
        if(k==0)
            return head;
        int rotate=count-k;
        p=head;
        while(rotate-->1)
        {
            p=p.next;
        }
        ListNode q=p.next;
        p.next=null;
        ListNode r=q;
        while(r.next!=null)
            r=r.next;
        r.next=head;
        return q;
    }
}