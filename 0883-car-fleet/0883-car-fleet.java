class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length ;
        double[][] res = new double[n][2] ;
        for(int i = 0 ; i < n ;i++){
            res[i][0] = position[i] ;
            res[i][1] =(double)(target - position[i])/speed[i] ;
        }
        Arrays.sort(res , (a ,b)-> Double.compare(b[0] , a[0])) ;
        // Stack<Double> stk = new Stack<>();
        // stk.push(res[0][1]);
        double prevTime = 0;
        int count = 0 ;
        for(int i = 0 ; i < n ;i++){
            if(prevTime < res[i][1]){
                prevTime = res[i][1] ;
                count++;
            }
        }
        return count ;
    }
}