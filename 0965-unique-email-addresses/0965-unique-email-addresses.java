class Solution {
    private String check(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i)  == '@'|| s.charAt(i) == '+')break;
            if(s.charAt(i) ==  '.') continue ;
            sb.append(s.charAt(i));
        }
        sb.append(s.substring(s.indexOf('@') , s.length()-1));
        return sb.toString();
    }
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < emails.length ;i++){
            String em = check(emails[i]);
            set.add(em);
        }
        return set.size();
    }
}