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
    List<Integer>list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        Stack<TreeNode> s1=new Stack<>();
        // Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode curr=s1.pop();
            list.add(0,curr.val);
            if(curr.left!=null)
                s1.push(curr.left);
            if(curr.right!=null)
                s1.push(curr.right);
        }
        // while(!s2.isEmpty())
        // {
        //     TreeNode curr=s2.pop();
        //     list.add(curr.val);
        // }
        return list;
    }
}