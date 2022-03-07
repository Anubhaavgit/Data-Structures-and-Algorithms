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
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val>l2.val)
        {
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode head=l1;
        while(l1!=null&&l2!=null)
        {
            ListNode tmp=null;
            while(l1!=null&&l1.val<=l2.val)
            {
                tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        return head;
        
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