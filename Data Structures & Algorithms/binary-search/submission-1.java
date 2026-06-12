class Solution {


  public int binary(int l, int h, int target, int[] nums){
    if(l>h)return -1;
    int mid=(l+h)/2;
    if(nums[mid]==target)return mid;
    else if(target>nums[mid]){
        return binary(mid+1,h,target,nums);
    }else{
        return binary(l,mid-1,target,nums);
    }
  }


    public int search(int[] nums, int target) {
        return binary(0,nums.length-1,target,nums);
    }
}
