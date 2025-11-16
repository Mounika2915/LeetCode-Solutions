class Solution {
    public int numSub(String s) {
        int mod = 1_000_000_007;
        int count = 0 ; 
        int res = 0 ;
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                count = 0 ;
            }
            res = (res + count)%mod ;
        }
        return res;
    }
}