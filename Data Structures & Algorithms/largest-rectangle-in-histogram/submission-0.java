class Solution {
    public int largestRectangleArea(int[] heights) {
        int m=heights.length;
        int[] nse=new int[m];
        int[] pse=new int[m];
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for(int i=m-1;i>=0;i--){
           while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
            stack.pop();
           }
           if(stack.isEmpty()){
            nse[i]=m;
           }else{
            nse[i]=stack.peek();
           }
           stack.push(i);
        }
        
        stack.clear();

        for(int i=0;i<m;i++){
           while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
            stack.pop();
           }
           if(stack.isEmpty()){
            pse[i]=-1;
           }else{
            pse[i]=stack.peek();
           }
           stack.push(i);
        }
         
         int max=-1;

        for(int i=0;i<heights.length;i++){
                int a=nse[i]-1;
                int b=pse[i]+1;
                max=Math.max(max,(a-b+1)*heights[i]);
        }
        return max;
    }
}
