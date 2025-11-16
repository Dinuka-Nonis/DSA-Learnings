public class Sort012 {
    static int[] Sort(int[] arr , int n ){
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <=high) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp ;
                high--;
            }
        }
        return arr;
    }
}
