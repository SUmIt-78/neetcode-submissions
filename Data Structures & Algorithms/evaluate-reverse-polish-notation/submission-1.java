class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack=new ArrayDeque<>();
        for(String str:tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int b=Integer.valueOf(stack.pop());
                int a=Integer.valueOf(stack.pop());
                int res=0;
                 if(str.equals("+")){
                    res=a+b;
                 }else if(str.equals("-")){
                    res=a-b;
                 }else if(str.equals("*")){
                    res=a*b;
                 }else{
                    res=a/b;
                 }
                 stack.push(String.valueOf(res));
            }else{
                stack.push(str);
            }
        }
        int a= Integer.valueOf(stack.pop()); 
        return a;
       
    }
}
