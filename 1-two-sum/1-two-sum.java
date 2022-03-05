import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int y;
        Hashtable<Integer,Integer> hm=new Hashtable<>();

        for(int i=0;i< nums.length;i++)
        {
            y=target-nums[i];
            if(hm.containsKey(y)){
                return new int[]{hm.get(y),i};
            }
                hm.put(nums[i], i);
        }
        return null;
    }
}