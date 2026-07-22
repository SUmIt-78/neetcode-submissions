class Solution {
  public void swap(int i, int j, int[] nums){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
  }
     public void permute(int[] nums, List<List<Integer>> res, int indx) {
        if(indx>=nums.length){
            res.add(new ArrayList<>(Arrays.stream(nums).boxed().toList()));
            return;
        }
         for(int j=indx;j<nums.length;j++){
            swap(indx,j,nums);
            permute(nums,res,indx+1);
            swap(j,indx,nums);
         }

    }



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        permute(nums,res,0);
        return res;
    }
}
