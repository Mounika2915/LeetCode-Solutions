class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] arr = new int[colors.length + k - 1];
        int i = 0 ;
        for(i = 0 ; i < colors.length ;i++){
            arr[i] = colors[i];
        }
        int x = 0 ;
        for(int j = i ; j < arr.length ; j++){
            arr[j] = colors[x];
            x++;
        }
        int l = 0 ;
        int count = 0 ;
        for(int r = 1 ;  r < arr.length ;r++){
            if(r > 0 && arr[r] == arr[r-1]){
                l = r ;
            }
            if(r - l + 1 >= k){
                count++;
            }
        }
        return count ;
    }
}