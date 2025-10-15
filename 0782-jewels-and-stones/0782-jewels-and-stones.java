class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < stones.length() ;i++){
            char c = stones.charAt(i);
            map.put(c ,map.getOrDefault(c , 0)+1) ;
        }
        int count = 0 ;
        for(char c : jewels.toCharArray()){
            if(map.containsKey(c)){
                count += map.get(c);
            }
        }
        return count ;
    }
}