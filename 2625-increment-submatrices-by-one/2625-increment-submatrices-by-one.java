class Solution {
    private void helper(int[][] mat , int row1 , int col1 , int row2 , int col2){
        for(int i = row1 ; i <= row2 ;i++){
            for(int j = col1 ;j <= col2 ;j++){
                mat[i][j] += 1 ;
            }
        }
    }
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for(int i = 0 ; i < queries.length ;i++){
            int row1 = queries[i][0] ;
            int col1 = queries[i][1] ; 
            int row2 = queries[i][2] ;
            int col2 = queries[i][3] ; 
            helper(mat , row1 ,col1 , row2 , col2);
        }
        return mat ;
    }
}