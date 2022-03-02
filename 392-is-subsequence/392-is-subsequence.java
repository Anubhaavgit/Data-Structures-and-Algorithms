class Solution {
    public boolean isSubsequence(String s1, String s2) {
        if(s1.length()==0)
            return true;
        if(s2.length()==0)
            return false;
        
         for(int i=0,j=0;i<s2.length();i++)
        {
            if(s2.charAt(i)==s1.charAt(j))
            {
                j++;
            }
            if(j==s1.length())
                return true;
        }
        return false;
    }
}