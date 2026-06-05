class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.putIfAbsent(num,0);
            mp.put(num,mp.get(num)+1);
        }
        var s=mp
        .entrySet()
        .stream()
        .sorted((s1,s2)-> s2.getValue()-s1.getValue())
        .limit(k)
        .collect(Collectors.toList());
         System.out.println(s);
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
          arr[i]=s.get(i).getKey();
        }

        return arr;

    }
}
