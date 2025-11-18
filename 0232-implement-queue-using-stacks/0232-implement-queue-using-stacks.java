class MyQueue {
    Stack<Integer> input ;
    Stack<Integer> output ;
    // Stack<Integer> stk1 ;
    // Stack<Integer> stk2 ;
    public MyQueue() {
        // stk1 = new Stack<>() ;
        // stk2 = new Stack<>() ;
        input = new Stack<>() ;
        output = new Stack<>() ;
    }
    
    public void push(int x) {
        input.push(x);
        // while(!stk1.isEmpty()){
        //     stk2.push(stk1.pop());
        // }
        // stk1.push(x) ;
        // while(!stk2.isEmpty()){
        //     stk1.push(stk2.pop());
        // }
    }
    
    public int pop() {
        if(!output.isEmpty()){
           return  output.pop();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.isEmpty() ? -1 : output.pop();
        }
        // if(stk1.isEmpty()) return -1 ;
        // return stk1.pop();
    }
    
    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.isEmpty() ? -1 : output.peek();
        }
        // if(stk1.isEmpty()) return -1 ;
        // return stk1.peek();
    }
    
    public boolean empty() {
        // return stk1.size() < 0;
      

        if(!output.isEmpty()){
            return false;
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.isEmpty();
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */