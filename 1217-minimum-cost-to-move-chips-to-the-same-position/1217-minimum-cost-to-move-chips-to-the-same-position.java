class Solution {
    public int minCostToMoveChips(int[] position) {
        if(position.length==1)
            return 0;
        int n=position.length;
        int even=0,odd=0;
         for(int i=0;i<n;i++)
        {
             if(position[i]%2==0)
                 even++;
             else
                 odd++;
        }
        return Math.min(odd,even);
    }
}