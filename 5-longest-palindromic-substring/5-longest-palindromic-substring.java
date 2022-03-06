class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1||s==null)
            return "";
        int n=s.length();
        int start=0,end=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int len1=maxLengthPalin(s,i,i);
            int len2=maxLengthPalin(s,i,i+1);
            max=Math.max(len1,len2);
            if(max>end-start)
            {
                start=i-(max-1)/2;
                end=i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
    int maxLengthPalin(String s,int left,int right)
    {
        if(s==null||left>right) return 0;
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}