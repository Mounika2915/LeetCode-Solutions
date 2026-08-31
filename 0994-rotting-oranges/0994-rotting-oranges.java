class Pair{
    int sr ;
    int sc ; 
    int tm ; 
    Pair(int sr , int sc ,int tm){
        this.sr = sr ; 
        this.sc = sc ; 
        this.tm = tm ; 
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>() ; 
        int m = grid.length ; 
        int n = grid[0].length ; 
        int[][] vis = new int[m][n];
        int cntFresh = 0 ; 
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i , j , 0 ) ) ;
                    vis[i][j] = 2 ;  
                }if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }

        int mintm = 0 ; 
        int[] drow = {-1 , 0 , 1 , 0};
        int[] dcol = {0 , 1 , 0 , -1};
        while(!q.isEmpty()){
            
                int r = q.peek().sr;
                int c = q.peek().sc ;
                int ctm = q.peek().tm ; 
                mintm = Math.max(mintm ,ctm);
                q.remove(); 
                for(int d = 0 ; d < drow.length ; d++){
                    int nrow = r + drow[d] ; 
                    int ncol = c + dcol[d] ; 
                    if(nrow >= 0 && ncol >= 0 && nrow < m && ncol < n &&grid[nrow][ncol] == 1 && grid[nrow][ncol] != 2){
                        q.add(new Pair(nrow , ncol , ctm + 1));
                        grid[nrow][ncol] = 2 ; 
                        cntFresh--;
                    }
                }
            
        }
        if(cntFresh > 0){
            return -1 ;
        }
        return mintm ; 
    }
}