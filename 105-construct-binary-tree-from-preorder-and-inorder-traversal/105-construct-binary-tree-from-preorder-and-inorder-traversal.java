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
    TreeNode BTree(int[]pre,HashMap<Integer,Integer>hm, int is,int ie)
    {
        
        if(is>ie)
            return null;
        TreeNode temp=new TreeNode(pre[preindex++]);
        
        int inIdx=hm.get(temp.val);
        // for(int i=is;i<=ie;i++)
        // {
        //     if(in[i]==temp.val)
        //     {
        //         inIdx=i;
        //         break;
        //     }
        // }
        temp.left=BTree(pre,hm,is,inIdx-1);
        temp.right=BTree(pre,hm,inIdx+1,ie);
        return temp;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        return BTree(preorder,hm,0,preorder.length-1);   
    }
}