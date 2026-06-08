class Solution {
    public int trap(int[] height) {
        int[] preMax=new int[height.length];
        int[] sufMax=new int[height.length];
        int total=0;
        
         for(int i=0;i<height.length;i++){
            preMax[i]= i==0? height[i]: Math.max(preMax[i-1],height[i]);
         }

         for(int i=height.length-1;i>=0;i--){
            sufMax[i]=i==height.length-1? height[i]:Math.max(sufMax[i+1],height[i]);
         }



        for(int i=0;i<sufMax.length;i++){
            if(preMax[i]==-1 || sufMax[i]==-1)continue;
            int content=Math.min(preMax[i],sufMax[i])-height[i];
            total+=content;
        }

        return total;



    }
}
