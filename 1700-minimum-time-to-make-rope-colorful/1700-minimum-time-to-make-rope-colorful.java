class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total  = 0 ;
        int maxSum = neededTime[0];
        for(int i = 1 ; i < colors.length() ;i++){
            if(colors.charAt(i) == colors.charAt(i-1)){
                total += Math.min(maxSum , neededTime[i]);
                maxSum = Math.max(maxSum , neededTime[i]);
            }else{
                maxSum = neededTime[i];
            }
        }
        
        return total ;
    }
}