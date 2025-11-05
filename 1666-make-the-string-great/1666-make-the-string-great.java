class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i) ;
            if(!stk.isEmpty() && Math.abs(stk.peek() - c) == 32){
               stk.pop();
                
            }else{
                stk.push(c);
            }
        }
        if(stk.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString();
    }
}