class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer > map = new HashMap<>();
        int oddCount = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1) ;
            if(map.get(ch) % 2 == 1){
                oddCount++;
            }else{
                oddCount-- ;
            }
        }
        if(oddCount > 1){
            return s.length() - oddCount + 1 ;
        }
        return s.length();
    }
}