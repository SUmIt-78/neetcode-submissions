class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int s=0;
        int e=numbers.length-1;
        while(s<e){
            int sum=numbers[s]+numbers[e];
            if(sum==target){
                res[0]=s+1;
                res[1]=e+1;
                return res;
            }else if(sum>target){
                e--;
            }else{
                s++;
            }
        }
        return res;
    }
}
