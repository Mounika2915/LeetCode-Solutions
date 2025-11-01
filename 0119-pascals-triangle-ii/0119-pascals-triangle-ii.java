class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        for(int i = 2 ; i <= rowIndex + 1 ; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1 ; j < i-1 ; j++){
                curr.add(prevRow.get(j-1) + prevRow.get(j));
            }
            curr.add(1);
            prevRow = curr ;
        }
        return prevRow ;
    }
}