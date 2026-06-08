class Solution {
    public int maxProfit(int[] prices) {
        int[] sufMax=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            sufMax[i]=i==prices.length-1? prices[i]:Math.max(sufMax[i+1],prices[i]);
        }
        int max=0;
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,sufMax[i]-prices[i]);
        }
        return max;
    }
}
