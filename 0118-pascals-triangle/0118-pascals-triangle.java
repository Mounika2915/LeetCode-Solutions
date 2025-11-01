class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        result.add(prevRow);
        for(int i = 2 ; i <= numRows ;i++){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j = 1 ; j < i-1 ;j++){
                nextRow.add(prevRow.get(j-1) + prevRow.get(j)) ;
            }
            nextRow.add(1);
            prevRow = nextRow ;
            result.add(nextRow);
        }
        return result ;
    }
}