class Solution {
    public int romanToInt(String s) {
        char []arr=s.toCharArray();
        int []value=new int[s.length()];
        
        
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        for(int i=0;i<s.length();i++)
        {
            value[i]=hm.get(arr[i]);
        }
        for(int i=1;i<s.length();i++)
        {
            if(value[i]>value[i-1])
                value[i-1]=-value[i-1];
        }
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            res+=value[i];
        }
        return res;
    }
}