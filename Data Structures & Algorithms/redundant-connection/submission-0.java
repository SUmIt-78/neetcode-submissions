
class DSU{
    int[] parents;

   public DSU(){
    parents=new int[101];
    for(int i=0;i<101;i++){
        parents[i]=i;
    }
   }

   public int find(int x){
    if(parents[x]==x)return x;
    return find(parents[x]);
   }

   public boolean union(int u,int v){
    int pu=find(u);
    int pv=find(v);
    if(pu==pv)return false;
    parents[pu]=pv;
    return true;
   }


}


class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu=new DSU();
        int[] res=null;
        for(int[] edge:edges){
            if(!dsu.union(edge[0],edge[1]))res=edge;
        }
        return res;
    }
}
