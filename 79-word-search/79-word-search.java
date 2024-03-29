class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,0,word))
                    return true;
            }
        }
        return false;
    }
    boolean dfs(char [][]board,int i, int j,int count,String word)
    {
        if(count==word.length())
            return true;
        if( i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(count))
            return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found= dfs(board,i+1,j,count+1,word)
            ||dfs(board,i-1,j,count+1,word)
            ||dfs(board,i,j+1,count+1,word)
            ||dfs(board,i,j-1,count+1,word);
        board[i][j]=temp;
        return found;
    }
}