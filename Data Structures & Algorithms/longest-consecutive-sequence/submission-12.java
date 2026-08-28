class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int length=nums.length;
        
        
        int cpt=0;
        for(int i=0;i<length;i++){
            set.add(nums[i]);
        }

        for(Integer x:set){
            // debut ?
            if(set.contains(x-1))
            continue;
            int y=x;
            int len=1;
            while(set.contains(y+1)){
                len++;
                y=y+1;
            }
            if(cpt<len)
            cpt=len;
            len=1;
        }
        return cpt;
        
    }
}
