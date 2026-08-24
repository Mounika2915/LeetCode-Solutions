class Pair{
    int index ; 
    int value ; 
    Pair(int index  , int value){
        this.index = index ;
        this.value = value ; 
    }
    public int getValue(){
        return this.value ; 
    }
    public int getIndex(){
        return this.index ; 
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
        //     int res = Integer.compare(a.value , b.value);
        //     if(res == 0){
        //         return Integer.compare(a.index , b.index) ; 
        //     }
        //     return res ; 
        // });
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            Comparator.comparingInt(Pair::getValue)
            .thenComparing(Comparator.comparingInt(Pair::getIndex))
        );

        for(int i = 0 ; i < nums.length ;i++){
            pq.add(new Pair(i , nums[i])) ; 
        }

        for(int i = 0 ; i < k ; i++){
            Pair p = pq.remove();
            pq.add(new Pair(p.index , p.value * multiplier));
        }

        //Replacing the values in the indexes ;  
        for(int i = 0 ; i < nums.length;i++){
            Pair p = pq.remove() ; 
            nums[p.getIndex()] = p.getValue(); 
        }
        return nums;
    }
}