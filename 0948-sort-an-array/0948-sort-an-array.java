class Solution {
    // private void quickSort(int[] nums , int  low , int high){
    //     if(low < high){
    //         int pivot = partition(nums , low , high) ;
    //         quickSort(nums , low , pivot - 1) ;
    //         quickSort(nums , pivot + 1 , high) ;
    //     }
    // }
    // private int partition(int[] nums , int low , int high){
    //     int pivot = nums[high] ;
    //     int i = low - 1 ;
    //     for(int j = low ; j < high ; j++){
    //         if(nums[j] < pivot){
    //             i++;
    //             swap(nums ,i , j) ;
    //         }
    //     }
    //     swap(nums , i+ 1 , high) ;
    //     return i + 1 ;
    // }
    // private void swap(int[] nums , int i , int j){
    //     int temp = nums[i] ;
    //     nums[i] = nums[j] ;
    //     nums[j] = temp ;
    // }

    private void mergeSort(int[] nums , int l , int h){
        if(l >= h) return ;
        int mid = l + (h - l) / 2 ;
        mergeSort(nums , l , mid );
        mergeSort(nums , mid + 1 , h );
        merge(nums , l , mid , h );
    }
    private void merge(int[] nums , int l , int mid , int h){
        int n1 = mid - l  + 1 ;
        int n2 = h - mid ;

        int[] t1 = new int[n1];
        int[] t2 = new int[n2] ;

        for(int i = 0 ; i < n1 ;i++){
            t1[i] = nums[l + i] ;
        }
        for(int j = 0 ; j < n2 ;j++){
            t2[j] = nums[mid + 1 + j] ;
        }

        int i = 0 , j = 0 , k = l ; 
        while(i < n1 && j < n2){
            if(t1[i] <= t2[j]){
                nums[k++] = t1[i++];
            }else{
                nums[k++] = t2[j++];
            }
        }

        while(i < n1){
            nums[k++] = t1[i++];
        }
        while(j < n2){
            nums[k++] = t2[j++];
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length - 1);
        return nums ;
    }
}