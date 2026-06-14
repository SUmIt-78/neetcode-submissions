class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchMatrix(matrix,target,0,matrix.length*matrix[0].length-1);
    }


       public boolean searchMatrix(int[][] matrix, int target, int st, int end) {
           if(st>end)return false;
           int mid=(st+end)/2;
           int row=mid/matrix[0].length;
           int col=mid%matrix[0].length;
           if(matrix[row][col]==target){
            return true;
           }else if(matrix[row][col]<target){
            return searchMatrix(matrix,target,mid+1,end);
           }else{
            return searchMatrix(matrix,target,st,mid-1);
           }
    }
}
