class StockSpanner {
    Stack<int[] > stk ;
    int i ;
    public StockSpanner() {
        stk = new Stack<>();
        int i = 0 ; 
    }
    
    public int next(int price) {
        int span = 1 ;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
           span += stk.pop()[1];
        }
        stk.push(new int[]{price , span});
        return span; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */