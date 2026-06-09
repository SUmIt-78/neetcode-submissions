class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int[] freq=new int[27];
        int maxFreq=0;
        int maxLen=0;

        while(r<s.length()){

            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            while((r-l+1)>maxFreq+k){
                freq[s.charAt(l)-'A']--;
                maxFreq=0;
                for(int fr:freq){
                    maxFreq=Math.max(maxFreq,fr);
                }
                l++;
            }

            maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}
