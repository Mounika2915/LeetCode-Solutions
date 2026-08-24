class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a ,b) -> Integer.compare(b,a)) ; 
        for(int i = 0 ; i < gifts.length ; i++){
            pq.add(gifts[i]) ; 
        }
        for(int i = 0 ; i < k ;i++){
            int val = (int)Math.sqrt(pq.remove());
            pq.add(val) ; 
        }
        long sum = 0 ; 
        while(!pq.isEmpty()){
            sum += pq.remove() ; 
        }
        return sum ; 
    }
}