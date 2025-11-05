class Solution {
    public String reverseWords(String s) {
        // String[] words = s.split("\\s+");
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0 ; i < words.length ;i++){
        //     char[] letters = words[i].toCharArray();
        //     int l = 0 , r = letters.length -1 ;
        //     while(l <= r){
        //         char temp = letters[l];
        //         letters[l] = letters[r];
        //         letters[r] = temp ;
        //         l++;
        //         r--;
        //     }
        //     sb.append(new String(letters));
        //     if(i < words.length -1){
        //         sb.append(" ");
        //     }
        // }
        // return sb.toString();

        char[] c = s.toCharArray();
        int j = 0 ;
        for(int i = 0 ; i <= c.length ;i++){
            if(i == c.length || c[i] == ' '){
                reverse(c , j , i-1) ;
                j = i + 1 ;
            }
        }
        return new String(c);
    }
    private void reverse(char[] c , int s , int e){
        while(s < e){
            char temp = c[s];
            c[s] = c[e];
            c[e] = temp ;
            s++;
            e-- ;
        }
    }
}