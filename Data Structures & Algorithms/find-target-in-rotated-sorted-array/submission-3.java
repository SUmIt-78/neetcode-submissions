class Solution {

  public int findPivot(int[] nums, int st, int end){
    if(st==end)return st;
    int mid=(st+end)/2;
    if(nums[mid]>nums[end]){
        return findPivot(nums,mid+1,end);
    }else{
        return findPivot(nums,st,mid);
    }
  }


  public int binary(int[] nums, int st, int end, int target){
         if(st>end)return -1;
         int mid=(st+end)/2;
         if(nums[mid]==target){
             return mid;
         }else if(nums[mid]>target){
            return binary(nums,st,mid-1,target);
         }else{
            return binary(nums,mid+1,end,target);
         }
  }

    public int search(int[] nums, int target) {
        int pivot=findPivot(nums,0, nums.length-1);
        System.out.println(pivot);
        int res=binary(nums,0,pivot-1,target);
        int res1=binary(nums,pivot,nums.length-1,target);

        if(res==-1 && res1==-1){
            return res;
        }else{
            if(res==-1){
                return res1;
            }else{
                return res;
            }
        }
    }
}
