class Solution {

  public int hours(int[] piles, int speed){
    int totalHours=0;
        for(int pile:piles){
            if(pile%speed==0){
                int curr=pile/speed;
                totalHours+=curr;
            }else{
                int curr=pile/speed;
                totalHours=totalHours+curr+1;
            }
        }
        return totalHours;
  }



   public int binary(int[] piles, int stSpeed, int endSpeed, int minSpeed, int h){
    if(stSpeed>endSpeed){
        return minSpeed;
    }
    int mid=stSpeed+((endSpeed-stSpeed)/2);
      int hours=hours(piles,mid);
      if(hours>h){
         return binary(piles,mid+1,endSpeed,minSpeed,h);
      }else{
        minSpeed=mid;
        return binary(piles,stSpeed,mid-1,minSpeed,h);
      }
   }

    public int minEatingSpeed(int[] piles, int h) {
        return binary(piles,1,Integer.MAX_VALUE,0,h);
    }
}
