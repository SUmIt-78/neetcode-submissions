class Solution {

   int dp(int n,Integer[] dp){
    if(n==0)return 1;
        if(n<0) return 0;
        if(dp[n]!=null)return dp[n];
        dp[n]=dp(n-1,dp)+dp(n-2,dp);
        return dp[n];
   }


    public int climbStairs(int n) {
        Integer[] dp=new Integer[n+1];
        return dp(n,dp);
    }
}
