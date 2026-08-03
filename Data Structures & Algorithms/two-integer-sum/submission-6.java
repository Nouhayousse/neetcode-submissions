class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            int v=target-nums[i];
            if(map.containsKey(v))
            return new int[]{map.get(v),i};
            else
            map.put(nums[i],i);

        }
        return new int[]{0,0};
        
    }
}
