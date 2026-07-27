class Solution {
   public void letterCombinations(String digits, List<String> res, StringBuilder sb, int indx, Map<Character,String> mp){
         if(indx>=digits.length()){
            res.add(sb.toString());
            return;
         }
         String str=mp.get(digits.charAt(indx));
          for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            letterCombinations(digits,res,sb,indx+1,mp);
            sb.deleteCharAt(sb.length()-1);
          }
   }

    public List<String> letterCombinations(String digits) {
          Map<Character,String> mp=new HashMap<>();
          mp.put('2',"abc");
          mp.put('3',"def");
          mp.put('4',"ghi");
          mp.put('5',"jkl");
          mp.put('6',"mno");
          mp.put('7',"pqrs");
          mp.put('8',"tuv");
          mp.put('9',"wxyz");
          List<String> res=new ArrayList<>();
          StringBuilder sb=new StringBuilder();
          if(digits.isEmpty())return res;
          letterCombinations(digits,res,sb,0,mp);
          return res;

    }
}
