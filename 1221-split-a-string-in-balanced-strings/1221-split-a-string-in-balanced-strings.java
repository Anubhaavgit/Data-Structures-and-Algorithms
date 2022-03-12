class Solution {
    boolean isBal(String s,int start,int end)
    {
         int l_c=0,r_c=0;
        for(int i=start;i<end;i++)
        {
            if(s.charAt(i)=='L')
                l_c++;
            else
                r_c++;
        }
        return (l_c==r_c);
    }
    public int balancedStringSplit(String s) {
        int count=0,j=0;
        for(int i=2;i<s.length();i=i+2)
        {
           if(isBal(s,j,i))
           {
               j=i;
               count++;
           }
        }
        return count+1;
    }
}