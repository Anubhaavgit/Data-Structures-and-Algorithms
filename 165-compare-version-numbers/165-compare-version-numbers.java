class Solution {
    public int compareVersion(String s1, String s2) {
         String[] arr1 = s1.split("\\.");
         String[] arr2 = s2.split("\\.");
        
        int []arr3=new int[Math.max(arr1.length,arr2.length)];
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=Integer.parseInt(arr1[i]);
        }
        
        int []arr4=new int[Math.max(arr1.length,arr2.length)];
        for(int i=0;i<arr2.length;i++)
        {
            arr4[i]=Integer.parseInt(arr2[i]);
        }
        
        
        for(int i=0;i<Math.max(arr1.length,arr2.length);i++)
        {
            int a=arr3[i];
            int b=arr4[i];
            if(a>b)
                return 1;
            else if(b>a)
                return -1;
        }
        return 0;
    }
}