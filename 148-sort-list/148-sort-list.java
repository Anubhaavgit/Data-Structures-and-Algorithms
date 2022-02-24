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
    public ListNode sortList(ListNode head) {
        List<Integer>list=new ArrayList<>();
        ListNode p=head;
        while(p!=null)
        {
            list.add(p.val);
            p=p.next;
        }
        Collections.sort(list);
        int i=0;
         p=head;
        while(p!=null)
        {
            p.val=list.get(i);
            p=p.next;
            i++;
        }
        return head;
    }
}