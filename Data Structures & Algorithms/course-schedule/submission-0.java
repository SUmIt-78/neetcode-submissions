class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] inbound=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] prerequisite:prerequisites){
             adj.get(prerequisite[1]).add(prerequisite[0]);
             inbound[prerequisite[0]]++;
        }
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<inbound.length;i++){
            if(inbound[i]==0)queue.offer(i);
        }

        while(!queue.isEmpty()){
             int node=queue.poll();
             for(int child:adj.get(node)){
                inbound[child]--;
                if(inbound[child]==0){
                    queue.add(child);
                }
             }
        }

        for(int num:inbound){
            if(num!=0)return false;
        }

        return true;



    }
}
