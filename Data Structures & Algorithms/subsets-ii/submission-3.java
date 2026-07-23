class Solution {
     public void subsetsWithDup(int[] nums, List<List<Integer>> res, List<Integer> curr, int indx, boolean[] visited) {
            while(indx<nums.length && indx>0 && nums[indx-1]==nums[indx] && !visited[indx-1])indx++;
        if(indx==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        visited[indx]=true;
        curr.add(nums[indx]);
        subsetsWithDup(nums,res,curr,indx+1,visited);
        visited[indx]=false;
        curr.remove(curr.size()-1);
        subsetsWithDup(nums,res,curr,indx+1,visited);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        subsetsWithDup(nums,res,curr,0,visited);
        List<Integer> empty=new ArrayList<>();
        if(!res.contains(empty)){
            res.add(empty);
        }
        return res;
    }
}
