class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
        for(int pivot=0;pivot<nums.length-2;pivot++){
            int s=pivot+1;
            int e=nums.length-1;
            while(s<e){
                int sum=nums[s]+nums[e];
                if(sum==-nums[pivot]){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[pivot]);
                    temp.add(nums[s]);
                    temp.add(nums[e]);
                     res.add(temp);
                     s++;
                     e--;
                }else if(sum>(-nums[pivot])){
                    e--;
                }else{
                    s++;
                }
            }
        }
        Set<List<Integer>> set=new HashSet(res);
        return new ArrayList<>(set);

    }
}
