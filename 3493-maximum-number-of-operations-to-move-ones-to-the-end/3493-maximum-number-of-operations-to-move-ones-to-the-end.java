class Solution {
    public int maxOperations(String s) {
        int count = 0 ;int ans = 0;
        for(int i = 0 ; i < s.length()  ;i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else if(i > 0 && s.charAt(i - 1) == '1'){
                ans += count ;
            }
        }
        return ans ;
    }
}