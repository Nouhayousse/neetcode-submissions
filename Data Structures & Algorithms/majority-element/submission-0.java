class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i]))
                freq.computeIfPresent(nums[i],(k,v)->v+1);

            else
                freq.put(nums[i],1);

        }
        int maj=nums.length/2;
        
        if(!freq.isEmpty()){
            
            for(Integer key : freq.keySet()){
                int value=freq.get(key);
                    if(value>maj){
                        return key;
                    }
            }
        }
           return 0;
        
    }
}