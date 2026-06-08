class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        Set<Character> seen=new HashSet<>();
        int max=0;

         while(right<s.length()){
              while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
              }
              max=Math.max(max,right-left+1);
              seen.add(s.charAt(right));
              right++;
         }
         return max;
    }
}
