class Solution {
    int getFib(int n, int [] dp)
    {
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        else
        {
           return dp[n]=getFib(n-1,dp)+getFib(n-2,dp);
        }
    }
    public int fib(int n) {
      if(n<=1)
            return n;
        int dp[]=new int [n+1];
        for(int i=0;i<n+1;i++)
            dp[i]=-1;
        getFib(n,dp);
        return dp[n];
    }
}