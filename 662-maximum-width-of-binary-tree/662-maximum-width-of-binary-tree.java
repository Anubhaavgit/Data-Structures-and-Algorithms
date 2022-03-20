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
    int max=0;
    void helper(TreeNode root,int hd,int position,TreeMap<Integer,Integer>mp)
    {
        if(root==null)
            return;
        mp.computeIfAbsent(hd,x->position);
        if(mp.get(hd)!=null)
            max=Math.max(max,position-mp.get(hd)+1);
        helper(root.left,hd+1,position*2,mp);
        helper(root.right,hd+1,position*2+1,mp);
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        helper(root,0,1,mp);
        int first=mp.firstKey();
        int last=mp.lastKey();
        return max;
    }
}