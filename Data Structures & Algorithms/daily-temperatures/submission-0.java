class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] nge=new int[temperatures.length];
        int[] res=new int[temperatures.length];

        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            nge[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(i);
        }
         for(int i=0;i<temperatures.length;i++){
               res[i]=nge[i]==-1? 0:nge[i]-i;
         }
         return res;
    }
}
