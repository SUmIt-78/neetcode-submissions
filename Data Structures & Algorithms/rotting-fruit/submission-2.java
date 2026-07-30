class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] distances=new int[grid.length][grid[0].length];
        for(int[] dist:distances){
            Arrays.fill(dist,Integer.MAX_VALUE);
        }
        Queue<int[]> queue=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    distances[i][j]=0;
                queue.offer(new int[]{i,j});
                }
            }
        }
        while(!queue.isEmpty()){
            int[] currPos=queue.poll();
            int x=currPos[0];
            int y=currPos[1];
            int[][] dirs={
                {x+1,y},
                {x,y+1},
                {x-1,y},
                {x,y-1}
            };
            for(int[] dir:dirs){
                int currX=dir[0];
                int currY=dir[1];
                if(currX>=grid.length || currX<0 || currY>=grid[0].length || currY<0 || grid[currX][currY]==0)continue;
                if(distances[currX][currY]>distances[x][y]+1){
                    distances[currX][currY]=distances[x][y]+1;
                    queue.offer(new int[] {currX,currY});
                }
            }
        }

        int max=0;

        for(int i=0;i<distances.length;i++){
            for(int j=0;j<distances[i].length;j++){
                if(grid[i][j]==0)continue;
                if(grid[i][j]==1 && distances[i][j]==Integer.MAX_VALUE){
                    return -1;
                }
                max=Math.max(max,distances[i][j]);
            }
        }
        return max;

    }
}
