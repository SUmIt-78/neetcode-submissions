class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
        int[] arr=new int[27];
        for(char c: str.toCharArray())arr[c-'a']++;
             String temp=Arrays.toString(arr);
             List<String> res=new ArrayList<>();
             mp.putIfAbsent(temp,res);
            mp.get(temp).add(str);
        
        }
        return new ArrayList<>(mp.values());
    }
}
