class pair
{
    int ind;
    int val;
    pair(int i,int v)
    {
        ind=i;
        val=v;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        PriorityQueue<pair>hm=new PriorityQueue<>((a,b)->a.val!=b.val? a.val-b.val:a.ind-b.ind);
        for(int i=0;i<r;i++)
        {
            int count=0;
               int j=0;
               while(j<c&&mat[i][j]==1)
               {
                   j++;
               }
            hm.add(new pair(i,j));
        }
        // System.out.println(hm.poll());
        int []res=new int [k];
        for(int i=0;i<k;i++)
        {
            pair p=hm.poll();
            // System.out.println(p.val);
            res[i]=p.ind;
        }
        return res;
    }
}