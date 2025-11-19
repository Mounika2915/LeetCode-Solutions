class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length ;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            if(asteroids[i] > 0 ){
                stk.push(asteroids[i]) ;  
            }else{
                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < -asteroids[i]){
                    stk.pop();
                }
                if(stk.isEmpty() || stk.peek() < 0){
                    stk.push(asteroids[i]);
                }

                if(stk.peek() == -asteroids[i]){
                    stk.pop();
                }
            }

            
        }
        int[] res = new int[stk.size()];
        int i = 0 ;
        for(int val : stk){
            res[i++] = val;
        }
        return res ;
    }
}