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
    void check(TreeNode root,int curr,int target,ArrayList<Integer>arr)
    {
        if(root==null)
            return;
        curr+=root.val;
        if(root.left==null&&root.right==null)
        {
            arr.add(curr);
            return;
        }
     check(root.left,curr,target,arr);
        check(root.right,curr,target,arr);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer>arr=new ArrayList<>();
        check(root,0,targetSum,arr);
        return arr.contains(targetSum);
    }
}