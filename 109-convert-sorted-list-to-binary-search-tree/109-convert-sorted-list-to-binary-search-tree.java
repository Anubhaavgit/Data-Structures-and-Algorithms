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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode constructTree(ArrayList<Integer>nums,int left,int right)
    {
        if(left>right)
            return null;
        
        int mid=left+(right-left)/2;
        TreeNode temp=new TreeNode(nums.get(mid));
        temp.left=constructTree(nums,left,mid-1);
        temp.right=constructTree(nums,mid+1,right);
        return temp;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        ArrayList<Integer>arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        return constructTree(arr,0,arr.size()-1);
    }
}