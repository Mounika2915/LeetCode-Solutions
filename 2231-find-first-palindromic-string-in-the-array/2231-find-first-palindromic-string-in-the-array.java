class Solution {
    private boolean isPalindrome(String s){
        int l = 0 , r = s.length()-1;
        while(l <=  r){
            if(s.charAt(l) != s.charAt(r)){
                return false ;
            }
            l++;
            r--;
        }
        return true ;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i < words.length ;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return ""; 
    }
}