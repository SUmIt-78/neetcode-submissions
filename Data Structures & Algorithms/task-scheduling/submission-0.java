class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[27];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->b-a);
        ArrayDeque<int[]> queue=new ArrayDeque<>();

         for(int num:freq){
            if(num!=0)pq.offer(num);
         }


        int times=0;
        while(!pq.isEmpty() || !queue.isEmpty()){
               times++;
               if(!pq.isEmpty()){
                int curr=pq.poll();
                curr--;
                if(curr>0){
                   queue.offer(new int[] {curr,times+n});
                }
               }
               if(!queue.isEmpty() && queue.peek()[1]<=times){
                     pq.offer(queue.poll()[0]);
                }
        }
        return times;
    }
}
