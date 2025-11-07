class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i =0  ;i < s.length() ;i++){
            if(!stk.isEmpty() && s.charAt(i) == '*'){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder() ;
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString() ;
    }
}