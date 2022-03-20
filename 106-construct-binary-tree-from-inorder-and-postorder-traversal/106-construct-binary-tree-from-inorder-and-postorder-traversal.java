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
    int index;
    TreeNode BTree(int[]post,HashMap<Integer,Integer>hm, int is,int ie)
    {
        
        if(is>ie)
            return null;
        TreeNode temp=new TreeNode(post[index--]);
        
        int inIdx=hm.get(temp.val);
        
        temp.right=BTree(post,hm,inIdx+1,ie);
        temp.left=BTree(post,hm,is,inIdx-1);
        
        return temp;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer>hm=new HashMap<>();
        index=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        
        return BTree(postorder,hm,0,postorder.length-1); 
    }
}