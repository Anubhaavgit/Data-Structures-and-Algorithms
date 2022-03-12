class Solution {
    public int minCostToMoveChips(int[] position) {
        if(position.length==1)
            return 0;
        if(position.length==2)
        {
            if(position[0]==position[1])
                return 0;
            return 1;
        }
        
        
        int n=position.length;
        int max=0;
         for(int i=0;i<n;i++)
        {
             if(position[i]>100)
                 position[i]=position[i]%100;
            max=Math.max(max,position[i]);
        }
        int []arr=new int[max+1];
        for(int i=0;i<n;i++)
        {
            arr[position[i]]++;
        }
        for(int i=2;i<max+1;i++)
        {
            arr[i]=arr[i]+arr[i-2];
        }
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
        return Math.min(arr[max-1],arr[max]);
    }
}