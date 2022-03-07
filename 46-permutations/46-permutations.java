class Solution {
    void permutations(int []nums,List<List<Integer>>ans,List<Integer>ds,boolean []isTaken)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!ds.contains(nums[i]))
            {
                ds.add(nums[i]);
                permutations(nums,ans,ds,isTaken);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>ans=new ArrayList<>();
        boolean []isTaken=new boolean[nums.length];
        List<Integer>ds=new ArrayList<>();
        permutations(nums,ans,ds,isTaken);
        return ans;
    }
}