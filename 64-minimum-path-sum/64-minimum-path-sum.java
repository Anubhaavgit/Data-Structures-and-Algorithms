class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0&&j==0)
                    dp[i][j]=grid[i][j];
                else
                {
                    dp[i][j]=grid[i][j]+Math.min(i==0?Integer.MAX_VALUE:dp[i-1][j],j==0?Integer.MAX_VALUE:dp[i][j-1]);
                }
            }
        }
        return dp[r-1][c-1];
    }
}