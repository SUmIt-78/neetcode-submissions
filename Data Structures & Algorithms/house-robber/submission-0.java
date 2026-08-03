class Solution {

 public int rob(int[] nums, int indx, Integer[] dp) {
        if(indx>=nums.length)return 0;
        if(dp[indx]!=null)return dp[indx];
        int currMax=Math.max(nums[indx]+rob(nums,indx+2,dp),rob(nums,indx+1,dp));
        return dp[indx]=currMax;
    }

    public int rob(int[] nums) {
        Integer[] dp=new Integer[nums.length+1];
        return rob(nums,0,dp);
    }
}
