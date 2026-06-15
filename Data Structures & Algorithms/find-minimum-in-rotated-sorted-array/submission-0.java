class Solution {

  public int binaryMin(int[] nums, int st, int end, int currMin){
    if(st>end)return currMin;
    int mid=(st+end)/2;
    if(nums[mid]>nums[end]){
        return binaryMin(nums,mid+1,end,currMin);
    }else{
        currMin=Math.min(currMin,nums[mid]);
        return binaryMin(nums,st,mid-1,currMin);
    }
  }

    public int findMin(int[] nums) {
        return binaryMin(nums,0,nums.length-1,Integer.MAX_VALUE);
    }
}
