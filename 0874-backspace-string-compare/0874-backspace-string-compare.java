class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i) == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() -1);
                }  
            }else{
                sb.append(s.charAt(i));
            }
        }
        for(int i = 0 ; i < t.length() ;i++){
            if(t.charAt(i) == '#'){
                if(st.length() > 0){
                    st.deleteCharAt(st.length() -1);
                }  
            }else{
                st.append(t.charAt(i));
            }
        }

        return sb.toString().equals(st.toString());

    }
}