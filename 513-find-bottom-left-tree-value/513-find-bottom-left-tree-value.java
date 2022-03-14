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
    int maxheight=0,ans=0;
    public int findBottomLeftValue(TreeNode root) {
        findElement(root,1);
        return ans;
    }
    void findElement(TreeNode root,int height)
    {
        if(root==null)
            return;
        if(maxheight<height)
        {
            maxheight=height;
            ans=root.val;
        }
        findElement(root.left,height+1);
        findElement(root.right,height+1);
    }
}