class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lis = new ArrayList<>();
        int val = 0 ;
        for(int num : nums){
            val = ((val * 2) + num) % 5 ;
            if(val == 0){
                lis.add(true );
            }else{
                lis.add(false);
            }
        }
        return lis ;
    }
}