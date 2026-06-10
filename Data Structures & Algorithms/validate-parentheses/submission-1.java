class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char poped=stack.pop();
                    if(ch==')' && poped!='(')return false;
                    if(ch=='}' && poped!='{')return false;
                    if(ch==']' && poped!='[')return false;
            }else{
                stack.push(ch);
            }
        }
        
        return stack.isEmpty()? true:false;
    }
}
