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
    int preindex=0;
    TreeNode BTree(int[]pre,int[]in, int is,int ie)
    {
        
        if(is>ie)
            return null;
        TreeNode temp=new TreeNode(pre[preindex++]);
        
        int inIdx=0;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]==temp.val)
            {
                inIdx=i;
                break;
            }
        }
        temp.left=BTree(pre,in,is,inIdx-1);
        temp.right=BTree(pre,in,inIdx+1,ie);
        return temp;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return BTree(preorder,inorder,0,preorder.length-1);   
    }
}