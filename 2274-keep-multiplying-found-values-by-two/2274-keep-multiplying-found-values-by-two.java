class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0  ; i < nums.length ;i++){
            map.put( nums[i] , nums[i] * 2 );
        }
        while(map.containsKey(original)){
            original = map.get(original) ; 
        }
        return original ;
    }
}