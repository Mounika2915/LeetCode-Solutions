class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String , Integer> map = new HashMap<>();
        String[] sArr1 = s1.split(" ");
        String[] sArr2 = s2.split(" ");
        for(int i = 0 ; i < sArr1.length ;i++){
            String s = sArr1[i];
            if(map.containsKey(s)){
                map.put(s , map.get(s) + 1 );
            }else{
                map.put(s , 1);
            }
        }
        for(int i = 0 ; i < sArr2.length ;i++){
            String s = sArr2[i];
            if(map.containsKey(s)){
                map.put(s , map.get(s) + 1 );
            }else{
                map.put(s , 1);
            }
        }
        List<String> res = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                res.add(key) ;
            }
        }
        return res.toArray(new String[0]);
    }
}