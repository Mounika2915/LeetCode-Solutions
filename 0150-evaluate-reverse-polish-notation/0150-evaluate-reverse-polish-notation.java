class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < tokens.length ;i++){
            if("+-*/".contains(tokens[i])){
                int a = stk.pop() ;
                int b = stk.pop() ;
                if(tokens[i].equals("+")){
                    stk.push(b + a);
                }else if(tokens[i].equals("-")){
                    stk.push(b - a);
                }else if(tokens[i].equals("*")){
                    stk.push(b * a) ;
                }else{
                    stk.push(b / a) ;
                }
            }else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.isEmpty() ? -1 : stk.peek() ;
        
    }
}