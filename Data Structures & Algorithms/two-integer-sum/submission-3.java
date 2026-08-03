class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            int v=target-nums[i];
            if(!map.containsKey(v))
            map.put(nums[i],i);
            else
            return new int[]{map.getOrDefault(v,0),i};
            


        }
        return new int[]{};
        
    }
}
