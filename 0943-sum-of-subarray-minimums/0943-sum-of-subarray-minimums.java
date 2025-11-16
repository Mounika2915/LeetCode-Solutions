class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=1_000_000_007;
        Stack<Integer> stack=new Stack<>();
        int[] prev = new int[n];
        int[] next=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            prev[i]=stack.empty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            next[i]=stack.empty()?n:stack.peek();
            stack.push(i);
        }
        long res=0;
        for(int i=0;i<n;i++){
            long count=(i-prev[i])*(next[i]-i);
            res=(res+arr[i]*count)%mod;
        }
        return (int)res;
    }
}