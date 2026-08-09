class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] gauche=new int[l];
        int[] droite=new int[l];
        int[] output=new int[l];
        
        gauche[0]=droite[l-1]=1;
        for(int i=0;i<l-1;i++)
        gauche[i+1]=gauche[i]*nums[i];

        for(int i=l-1;i>0;i--)
        droite[i-1]=droite[i]*nums[i];

        for(int i=0;i<l;i++)
        output[i]=droite[i]*gauche[i];

        return output;




        
    }
}  
