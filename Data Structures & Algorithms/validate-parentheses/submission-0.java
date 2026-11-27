// import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> suj=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='[' || c=='{' || c=='('){
                suj.push(c);
            }
            else{
                if(suj.isEmpty()){
                    return false;
                }
                // Char c1=suj.pop();
                if(c==']' && suj.peek()=='['){
                    suj.pop();
                }
                else if(c=='}' && suj.peek()=='{'){
                    suj.pop();
                }
                else if(c==')' && suj.peek()=='('){
                    suj.pop();
                }
                else{
                    return false;
                }
            }
        } 
        return suj.isEmpty();
    }
}