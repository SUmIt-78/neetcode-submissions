class Solution {

  public void markVisited(char[][] grid, boolean[][] visited, int m, int n){
      if(m>=grid.length || n>=grid[0].length || m<0 || n<0 || visited[m][n] || grid[m][n]=='0')return;
      visited[m][n]=true;
      markVisited(grid,visited,m+1,n);
      markVisited(grid,visited,m-1,n);
      markVisited(grid,visited,m,n+1);
      markVisited(grid,visited,m,n-1);
  }


    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    markVisited(grid,visited,i,j);
                }
            }
        }
        return count;
    }
}
