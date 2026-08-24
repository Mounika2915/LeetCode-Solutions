class Pair{
    long  s ; 
    int[] cords ; 
    Pair(long s , int[] cords){
        this.s = s ;
        this.cords  = cords ; 
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Long.compare(b.s , a.s));
        for(int i = 0 ; i < points.length ; i++){
            long distance = Math.abs(points[i][0] * points[i][0])  + Math.abs(points[i][1] * points[i][1]) ;
            pq.add(new Pair(distance , new int[]{points[i][0] , points[i][1]}));
            if(pq.size() > k){
                pq.remove();
            }
        }

        int[][] res = new int[k][2];
        int i = 0 ; 
        while(!pq.isEmpty()) {
            res[i][0] = pq.peek().cords[0];
            res[i][1] = pq.peek().cords[1];
            pq.remove() ; 
            i++;
        }
        return res ; 
    }
}