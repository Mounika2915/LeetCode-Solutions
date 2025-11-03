class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        for(int i = 0 ; i < flowerbed.length ; i++){
            boolean left = i == 0 || flowerbed[i-1] != 1;
            boolean right = i == flowerbed.length -1 || flowerbed[i+1] != 1;

            if(left && right && flowerbed[i] == 0 ){
                flowerbed[i] = 1 ;
                n-- ;
                
            }
        }
        return n <= 0 ; 
    }
}