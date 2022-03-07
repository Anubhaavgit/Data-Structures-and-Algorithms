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
    ListNode mergeList(ListNode l1,ListNode l2)
    {
        ListNode p=new ListNode(0);
        ListNode q=p;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
            {
                p.next=l1;
                p=p.next;
                l1=l1.next;
            }
            else
            {
                p.next=l2;
                p=p.next;
                l2=l2.next;
            }
        }
        if(l1==null)
        {
            p.next=l2;
        }
        if(l2==null)
        {
            p.next=l1;
        }
        return q.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        ListNode head=mergeList(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++)
        {
            head=mergeList(head,lists[i]);
        }
        return head;
    }
}