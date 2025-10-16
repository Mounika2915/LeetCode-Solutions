class Solution {
    private void backTrack(String combination , String next , String[] map , List<String> res){
        if(next.length()==0){
            res.add(combination);
        }else{
            String letters = map[next.charAt(0) - '2'];
            for(char c : letters.toCharArray()){
                backTrack(combination + c , next.substring(1),map , res);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>() ;
        if(digits.length() == 0) return res ;
        String[] map = {"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" ,"tuv" ,"wxyz" };

        backTrack("" , digits , map , res) ;
        return res ;

    }
}