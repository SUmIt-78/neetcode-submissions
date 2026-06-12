class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Integer> posToSpeed=new TreeMap<>((pos1,pos2)->pos2-pos1);
        for(int i=0;i<speed.length;i++){
            posToSpeed.put(position[i],speed[i]);
        }
        int res=0;
        double maxTime=0;
        for(int pos:posToSpeed.keySet()){
            int currSpeed=posToSpeed.get(pos);
            double time=(target-pos)/(double)currSpeed;
             if(time>maxTime){
                res++;
                maxTime=time;
             }
        }
        return res;
    }
}
