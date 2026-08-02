class Pair{
    int dest;
    int wt;
    Pair(int dest, int wt){
        this.dest=dest;
        this.wt=wt;
    }
}


class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distance=new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] time:times){
          adj.get(time[0]).add(new Pair(time[1],time[2]));
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p1.wt-p2.wt);
        pq.offer(new Pair(k,0));

        while(!pq.isEmpty()){
            Pair node=pq.poll();
          for(Pair child:adj.get(node.dest)){
               if(distance[child.dest]>distance[node.dest]+child.wt){
                distance[child.dest]=distance[node.dest]+child.wt;
                pq.offer(new Pair(child.dest,distance[child.dest]));
               }
          }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<distance.length;i++){
            max=Math.max(max,distance[i]);
        }
       return max==Integer.MAX_VALUE? -1:max;

    }
}
