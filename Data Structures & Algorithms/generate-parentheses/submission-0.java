class Solution {
  
  public boolean validated(String input){
    int m=0;
    for(int i=0;i<input.length();i++){
         if(m<0)break;
        if(input.charAt(i)=='(')m++;
        else m--;
    }
    return m==0;
  }

  public void generateParenthesis(int n, List<String> res, StringBuilder sb) {
        if(sb.length()==2*n){
            if(validated(sb.toString()))res.add(sb.toString());
            return;
        }
        sb.append('(');
        generateParenthesis(n,res,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        generateParenthesis(n,res,sb);
        sb.deleteCharAt(sb.length()-1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generateParenthesis(n,res,sb);
        return res;
    }
}
