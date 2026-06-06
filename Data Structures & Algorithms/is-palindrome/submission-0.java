class Solution {
    public boolean isPalindrome(String s) {
        String lower=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(lower.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(lower.charAt(end))){
                end--;
            }else{
                if(lower.charAt(start)!=lower.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
