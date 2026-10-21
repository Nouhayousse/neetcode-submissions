class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.computeIfPresent(nums[i],(k,v)->v+1);
            }
            else
                freq.put(nums[i],1);
            int v=freq.get(nums[i]);
                if(v>nums.length/2)
                    return nums[i];    

        }
           return 0;
        
    }
}