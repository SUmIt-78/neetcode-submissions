class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct=new int[nums.length];
        int[] sufixProduct=new int[nums.length];
        int[] ans=new int[nums.length];

         prefixProduct[0]=nums[0];
         sufixProduct[nums.length-1]=nums[nums.length-1];

         for(int i=1;i<nums.length;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i];
         }

         for(int i=nums.length-2;i>=0;i--){
            sufixProduct[i]=sufixProduct[i+1]*nums[i];
         }

         for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=sufixProduct[i+1];
            }else if(i==nums.length-1){
                ans[i]=prefixProduct[i-1];
            }else{
                ans[i]=sufixProduct[i+1]*prefixProduct[i-1];
            }
         }
         return ans;
          
         

    }
}  
