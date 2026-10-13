class Pair{
    int node;
    int wt ; 
    Pair(int node ,  int wt){
        this.node = node ; 
        this.wt = wt ; 
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < times.length ; i++){
            int u = times[i][0];
            int v = times[i][1];
            int wt = times[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist , Integer.MAX_VALUE) ; 
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.wt , b.wt));
        pq.add(new Pair(k , 0));
        dist[k] = 0 ; 
        while(!pq.isEmpty()){
            int node = pq.peek().node ; 
            int wt = pq.peek().wt ; 
            pq.remove();
            for(Pair p : adj.get(node)){
                int curr = p.node ; 
                int currWt = p.wt ; 
                if(currWt + wt < dist[curr]){
                    dist[curr] = currWt + wt ; 
                    pq.add(new Pair(curr , currWt + wt));

                }
            }
        }
        int max = -1 ; 
        for(int i = 1 ; i < dist.length ; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1  ; 
            }
            max = Math.max(max , dist[i]);
        }
        return max ; 

    }
}