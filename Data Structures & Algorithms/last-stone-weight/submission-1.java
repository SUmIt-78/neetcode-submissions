class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((s1,s2)->s2-s1);
        for(int stone:stones){
            maxHeap.offer(stone);
        }
        while(!maxHeap.isEmpty() && maxHeap.size()!=1){
            int firstMax=maxHeap.poll();
            int secondMax=maxHeap.poll();
            if(firstMax!=secondMax){
                maxHeap.offer(Math.abs(firstMax-secondMax));
            }
        }
        return maxHeap.isEmpty()? 0:maxHeap.poll();
    }
}
