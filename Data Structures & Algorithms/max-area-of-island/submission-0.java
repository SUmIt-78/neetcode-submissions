class Solution {

   public int markVisited(int[][] grid, boolean[][] visited, int m, int n){
      if(m>=grid.length || n>=grid[0].length || m<0 || n<0 || visited[m][n] || grid[m][n]==0)return 0;
      visited[m][n]=true;
      return 1 + markVisited(grid,visited,m+1,n)+
      markVisited(grid,visited,m-1,n)+
      markVisited(grid,visited,m,n+1)+
      markVisited(grid,visited,m,n-1);
  }


    public int numIslands(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                   count=Math.max(markVisited(grid,visited,i,j),count);
                }
            }
        }
        return count;
    }

    public int maxAreaOfIsland(int[][] grid) {
        return numIslands(grid);
    }
}
