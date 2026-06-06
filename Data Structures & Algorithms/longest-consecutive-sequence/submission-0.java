class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=0;
                while(set.contains(num)){
                    curr++;
                    num++;
                }
                max=Math.max(max,curr);
            }
        }
        return max;
    }
}
