class Tuple{
    int u ; 
    int v ; 
    int wt ; 
    Tuple(int u , int v , int wt){
        this.u = u ; 
        this.v = v ; 
        this.wt = wt ; 
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length , n = grid[0].length ; 
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.wt , b.wt));
        int[] rDir = {0,-1,0,1};
        int[] cDir = {1 , 0 , -1 , 0} ; 
        int[][] dist = new int[m][n];
        for(int[] ar : dist){
            Arrays.fill(ar , Integer.MAX_VALUE) ; 
        }
        int sum = grid[0][0] ; 
        dist[0][0] = grid[0][0] ; 
        pq.add(new Tuple(0 , 0  , grid[0][0]));
        while(!pq.isEmpty()){
            int r = pq.peek().u;
            int c = pq.peek().v;
            int wt = pq.peek().wt ; 
            pq.remove();
            if(wt > dist[r][c]) continue ; 
            if(r == m-1 && c == n-1) return wt ;
            for(int i = 0 ; i < rDir.length ; i++){
                int nRow = r + rDir[i];
                int nCol = c + cDir[i];
                
                if(nRow < 0 || nCol < 0 || nRow >= m || nCol >= n  ) continue ; 
                int nwt = grid[nRow][nCol];
                int newWater = Math.max(wt , nwt);
                if(newWater < dist[nRow][nCol]){
                    dist[nRow][nCol] = newWater ; 
                    pq.add(new Tuple(nRow , nCol , newWater));
                }
            }
        }
        return -1;
    }
}