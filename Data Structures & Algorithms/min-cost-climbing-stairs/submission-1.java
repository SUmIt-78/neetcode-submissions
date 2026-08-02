class Solution {

 public int minCostClimbingStairs(int[] cost, int i,Integer[] dp) {
        if(i>=cost.length)return 0;
        if(dp[i]!=null)return dp[i];
    dp[i]=Math.min(cost[i]+minCostClimbingStairs(cost,i+1,dp),cost[i]+minCostClimbingStairs(cost,i+2,dp));
    return dp[i];
    }


    public int minCostClimbingStairs(int[] cost) {
      Integer[] dp=new Integer[cost.length+1];
       return Math.min(minCostClimbingStairs(cost,0,dp),minCostClimbingStairs(cost,1,dp));
    }
}
