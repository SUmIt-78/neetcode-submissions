
class Pair{
    int timeStamp;
    String value;

    public Pair(int timeStamp, String value){
        this.timeStamp=timeStamp;
        this.value=value;
    }

}


class TimeMap {

    Map<String,TreeSet<Pair>> map;

    public TimeMap() {
        this.map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new TreeSet<>((p1,p2)->p1.timeStamp-p2.timeStamp));
       TreeSet<Pair> ts= map.get(key);
          ts.add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
               TreeSet<Pair> ts= map.get(key);
               if(ts==null)return "";
               Pair p=new Pair(timestamp,"dummy");
               Pair pres=ts.floor(p);
               return pres==null? "":pres.value;

    }
}
