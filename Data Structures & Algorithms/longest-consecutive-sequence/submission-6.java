class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = 1;
        int cpt=1;
        if(nums.length==0)
        return 0;

        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                
                continue;
            }else{
            if((long)nums[i]+1==nums[i+1]){
                len++;
                
            }
            
            else{
                if(cpt<len)
                 cpt=len;
                len=1;

                continue;
            }}
            if(cpt<len)
            cpt=len;
            
            

        }
        return cpt;
        
    }
}
