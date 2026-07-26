class Solution {

     public boolean exist(char[][] board, String word, int m, int n, int indx, boolean[][] visited) {
        if(indx>=word.length())return true;
        if(m<0 || m>=board.length || n<0 || n>=board[0].length || visited[m][n])return false;
        if(board[m][n]!=word.charAt(indx))return false;
        visited[m][n]=true;
        boolean res=(
            exist(board,word,m+1,n,indx+1,visited) ||
            exist(board,word,m-1,n,indx+1,visited) ||
            exist(board,word,m,n+1,indx+1,visited) ||
            exist(board,word,m,n-1,indx+1,visited)
        );
               visited[m][n]=false;
               return res;
 
    }


    public boolean exist(char[][] board, String word) {
        int row=-1;
        int col=-1;
                boolean[][] visited=new boolean[board.length][board[0].length];

        outer: for(int m=0;m<board.length;m++){
            for(int n=0;n<board[m].length;n++){
              boolean res= exist(board,word,m,n,0,visited);
              if(res)return res;
            }
        }
        return false;
        
    }
}
