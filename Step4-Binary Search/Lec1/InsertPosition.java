public class InsertPosition {
    public static int searchInsert(int[]arr, int x) {
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low + (high -low)/2;

            if(arr[mid] ==x)
                return mid;
            else if (arr[mid] < x)
                low = mid  +1;
            else
                high = mid-1;
        }
        return low;
    }
}
