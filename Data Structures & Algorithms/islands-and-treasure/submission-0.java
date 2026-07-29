class Solution {
    public void islandsAndTreasure(int[][] grid) {
        ArrayDeque<int[]> queue=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    queue.add(new int[] {i,j});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] currNode=queue.poll();
            int row=currNode[0];
            int col=currNode[1];
            int[][] dirs={
                {row+1,col},
                {row-1,col},
                {row,col+1},
                {row,col-1}
            };
            for(int[] dir:dirs){
                int currRow=dir[0];
                int currCol=dir[1];
                if(currRow>=grid.length || currRow<0 || currCol>=grid[0].length || currCol<0 || grid[currRow][currCol]==-1)continue;
                if(grid[currRow][currCol]>grid[row][col]+1){
                    grid[currRow][currCol]=grid[row][col]+1;
                    queue.offer(new int[] {currRow,currCol});
                }
            }
        }

    }
}
