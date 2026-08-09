public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int[] arr=new int[nums.length];
        int c=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
             p=p*nums[i];
             else c++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && c==0)
            arr[i]=p/nums[i];
            
            if(nums[i]!=0 && c>=1)
            arr[i]=0;
            if(nums[i]==0 && c==1)
            arr[i]=p;
            if(nums[i]==0 && c>1)
            arr[i]=0;
           
        }
    return arr ;

    }
}