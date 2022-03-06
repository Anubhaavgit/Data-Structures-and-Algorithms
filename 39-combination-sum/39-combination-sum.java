class Solution {
   void findCombination(int ind,int []arr,int target,List<List<Integer>>res,List<Integer>list)
   {
       if(ind==arr.length)
       {
           if(target==0)
           {
               res.add(new ArrayList<>(list));
           }
           return;
       }
       if(arr[ind]<=target)
       {
           list.add(arr[ind]);
           findCombination(ind,arr,target-arr[ind],res,list);
           list.remove(list.size()-1);
       }
       findCombination(ind+1,arr,target,res,list);
   }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        findCombination(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}