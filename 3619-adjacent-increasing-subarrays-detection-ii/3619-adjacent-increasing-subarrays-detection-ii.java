class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size() ;
        if(n == 0 ) return 0 ;
        if (n == 1) return 1 ;
        int[] end = new int[n];
        Arrays.fill(end , 1 );
        for(int i = 1 ; i < n ;i++){
            if(nums.get(i) > nums.get(i - 1)){
                end[i] = end[i-1] + 1 ;
            }
        }
        int[] start = new int[n];
        Arrays.fill(start , 1);
        for(int i = n - 2 ; i >= 0 ;i--){
            if(nums.get(i) < nums.get(i + 1)){
                start[i] = start[i+1]+1;
            }
        }
        int ans = 1 ;
        for(int k = 0 ; k + 1 < n ;k++){
            ans = Math.max(ans , Math.min(end[k] , start[k+1]));
        }
        return ans ;
    }
}