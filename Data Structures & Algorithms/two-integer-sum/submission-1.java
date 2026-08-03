class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=l-1;j>i;j--){
                int sum=nums[i]+nums[j];
                if(sum==target)
                return new int[]{i,j};
            }

        }
        return new int[0];
        
    }
}
