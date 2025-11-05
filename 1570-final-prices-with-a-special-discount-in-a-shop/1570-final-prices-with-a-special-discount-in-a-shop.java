class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < prices.length ;i++){
            while(!stk.isEmpty() && prices[i] <= prices[stk.peek()]){
                res[stk.peek()] = prices[stk.peek()] - prices[i];
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            res[stk.peek()] = prices[stk.peek()];
            stk.pop();
        }
        return res ;
    }
}