class Solution {

  public boolean isPalindrome(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j){
      if(s.charAt(i)!=s.charAt(j))return false;
      i++;
      j--;
    }
    return true;
  }


 public void partition(String s, List<List<String>> res, List<String> curr, int indx) {
        if(indx>=s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=indx+1;i<=s.length();i++){
            String sub=s.substring(indx,i);
            boolean isPal=isPalindrome(sub);
            if(isPal){
                curr.add(sub);
                partition(s,res,curr,i);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
         List<List<String>> res=new ArrayList<>();
         List<String> curr=new ArrayList<>();
         partition(s,res,curr,0);
         return res;
    }
}
