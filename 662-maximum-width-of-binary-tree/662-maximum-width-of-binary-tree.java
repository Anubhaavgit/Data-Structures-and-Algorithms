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
class Pair
{
    TreeNode node;
    int position;
    Pair(TreeNode n,int pos)
    {
        node=n;
        position=pos;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,1));
        int max=0;
              
        while(!q.isEmpty())
        {
            int first=0,last=0;
            int count=q.size();
            int mmin=q.peek().position;
            for(int i=0;i<count;i++)
            {
                int pos=q.peek().position-mmin;
                TreeNode curr=q.poll().node;

                if(i==0)
                    first=pos;
                if(i==count-1)
                    last=pos;
                
                if(curr.left!=null)
                    q.add(new Pair(curr.left,pos*2));
                if(curr.right!=null)
                    q.add(new Pair(curr.right,pos*2+1));
            }
            max=Math.max(max,last-first+1);
        }
        return max;
    }
}