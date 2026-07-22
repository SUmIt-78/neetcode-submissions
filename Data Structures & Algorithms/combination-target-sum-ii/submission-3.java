class Solution {

     public void combinationSum2(List<List<Integer>> res, List<Integer> curr, int[] candidates, int target, int index, boolean[] visited) {
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
while(index<candidates.length && index!=0 && candidates[index-1]==candidates[index] && !visited[index-1])index++;
 if(target<0 || index>=candidates.length )return;
        curr.add(candidates[index]);
        visited[index]=true;
        combinationSum2(res,curr,candidates,target-candidates[index],index+1,visited);
        curr.remove(curr.size()-1);
        visited[index]=false;
        combinationSum2(res,curr,candidates,target,index+1,visited);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] visited=new boolean[candidates.length];
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combinationSum2(res,curr,candidates,target,0,visited);
        return res;
    }
}
