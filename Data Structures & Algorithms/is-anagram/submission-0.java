class Solution {
    public boolean isAnagram(String s, String t) {

      int[] arr=new int[27];
      int [] arr1=new int[27];

      for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
      }
       for(int i=0;i<t.length();i++){
        arr1[t.charAt(i)-'a']++;
      }

      for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr1[i])return false;
      }
      
      return true;
    }
}
