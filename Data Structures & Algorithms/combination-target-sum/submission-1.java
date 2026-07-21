class Solution {

   public void combinationSum(List<List<Integer>> res, List<Integer> curr, int[] nums, int target, int index) {
        if(target<0)return;
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            combinationSum(res,curr,nums,target-nums[i],i);
            curr.remove(curr.size()-1);
        }
        
    }




    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combinationSum(res,curr,nums,target,0);
        return res;
    }
}
