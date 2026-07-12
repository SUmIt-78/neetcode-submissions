class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> maxHeap=new PriorityQueue<>((arr1,arr2)->{
        double dist1=(Math.sqrt(Math.pow(arr1[0],2)+Math.pow(arr1[1],2)));
        double dist2=(Math.sqrt(Math.pow(arr2[0],2)+Math.pow(arr2[1],2)));
         return Double.compare(dist2,dist1);
    });

     for(int[] point:points){
        maxHeap.offer(point);
         if(maxHeap.size()>k){
            maxHeap.poll();
        }
     }

     int[][] res=new int[k][2];
     int i=0;
     System.out.println(maxHeap.size());

     while(!maxHeap.isEmpty()){
        res[i]=maxHeap.poll();
        i++;
     }

     return res;



    }
}
