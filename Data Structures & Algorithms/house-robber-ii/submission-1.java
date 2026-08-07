class Solution {

 public int rob(int[] nums, int index,int isFirstIncluded, Integer[][] dp) {
        if(index>=nums.length)return 0;
        int incuding=0;
        if(dp[index][isFirstIncluded]!=null)return dp[index][isFirstIncluded];
        if(index==0){
           incuding=nums[index]+rob(nums,index+2,1,dp);
        }else{
            if(!(isFirstIncluded==1 && index==nums.length-1)){
             incuding=nums[index]+rob(nums,index+2,isFirstIncluded,dp);
            }
        }
        int excluding=rob(nums,index+1,isFirstIncluded,dp);
        return dp[index][isFirstIncluded]=Math.max(incuding,excluding);
    }

    public int rob(int[] nums) {
        Integer[][] dp=new Integer[nums.length][2];
        return rob(nums,0,0,dp);
    }
}
