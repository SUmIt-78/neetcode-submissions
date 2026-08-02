class Solution {

  boolean isCycle(List<List<Integer>> adj, boolean[] visited, int curr, int par){
     visited[curr]=true;
     boolean res=false;
     for(int child:adj.get(curr)){
        if(visited[child]&&child!=par)return true;
        if(visited[child])continue;
        res|=isCycle(adj,visited,child,curr);
     }
     return res;
  }




    public boolean validTree(int n, int[][] edges) {
       List<List<Integer>>adj=new ArrayList<>();
       boolean[] visited=new boolean[n];
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int[] edge:edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
       }
       boolean res=isCycle(adj,visited,0,-1);
       if(res)return false;
       for(boolean b:visited){
        if(!b)return false;
       }
       return true;
    }
}
