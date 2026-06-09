class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> frqMap=new HashMap<>();
        for(char c:s1.toCharArray()){
            frqMap.putIfAbsent(c,0);
            frqMap.put(c,frqMap.get(c)+1);
        }
        int l=0;
        int r=s1.length()-1;
        while(r<s2.length()){
            Map<Character,Integer> frqMapLocal=new HashMap<>();
            for(int i=l;i<=r;i++){
            frqMapLocal.putIfAbsent(s2.charAt(i),0);
            frqMapLocal.put(s2.charAt(i),frqMapLocal.get(s2.charAt(i))+1);
            }
            if(frqMap.equals(frqMapLocal)){
                return true;
            }
            r++;
            l++;
        }
        return false;
    }
}
