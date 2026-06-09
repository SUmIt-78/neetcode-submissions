class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> queue=new PriorityQueue<>((arr1,arr2)->arr2[0]-arr1[0]);
        for(int i=0;i<k;i++){
            queue.add(new int[] {nums[i],i});
        }
        int[] res=new int[nums.length-k+1];
        res[0]=queue.peek()[0];
         int resCount=1;
        for(int i=k;i<nums.length;i++,resCount++){
            while(!queue.isEmpty() && queue.peek()[1]<(i-(k-1))){
                queue.poll();
            }
            queue.add(new int[]{nums[i],i});
             res[resCount]=queue.peek()[0];
        }
        return res;

    }
}
