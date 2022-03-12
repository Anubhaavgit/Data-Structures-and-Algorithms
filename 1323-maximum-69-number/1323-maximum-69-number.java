class Solution {
    public int maximum69Number (int num) {
        String number=Integer.toString(num);
        char []arr=number.toCharArray();
        for(int i=0;i<number.length();i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                break;
            }
        }
        number=String.valueOf(arr);
        return Integer.parseInt(number);
    }
}