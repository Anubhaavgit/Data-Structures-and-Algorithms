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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                TreeNode curr=q.poll();
                if(curr==null)
                {
                    while(!q.isEmpty())
                    {
                        TreeNode check=q.poll();
                        if(check!=null)
                            return false;
                    }
                    if(q.isEmpty())
                        return true;
                }
                if(curr.left!=null)
                    q.add(curr.left);
                else
                    q.add(null);
                if(curr.right!=null)
                    q.add(curr.right);
                else
                    q.add(null);
            }
        }
        return true;
    }
}