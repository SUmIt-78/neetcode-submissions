class Solution {

   public void combinationSum(List<List<Integer>> res, List<Integer> curr, int[] nums, int target, int index) {
        if(target<0 || index>=nums.length)return;
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        combinationSum(res,curr,nums,target-nums[index],index);
        curr.remove(curr.size()-1);
        combinationSum(res,curr,nums,target,index+1);
    }




    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combinationSum(res,curr,nums,target,0);
        return res;
    }
}
