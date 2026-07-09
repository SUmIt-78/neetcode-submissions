class Solution {

 public void subsets(int[] num, int curr, List<Integer> ls, List<List<Integer>> res){
    if(curr==num.length){
        res.add(new ArrayList<>(ls));
        return;
    }
    ls.add(num[curr]);
    subsets(num,curr+1,ls,res);
    ls.remove(ls.size()-1);
    subsets(num,curr+1,ls,res);
 }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        subsets(nums,0,ls,res);
        return res;
    }
}
