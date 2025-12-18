public class LastOccurence {
    public static int lastOccurrenceBinarySearch(int[] arr, int key) {
    int start = 0, end = arr.length - 1;
    int result = -1;

    while (start <= end) {
        int mid = (start + end) / 2;

        if (arr[mid] == key) {
            result = mid;     // store index
            start = mid + 1;  // move right to find last occurrence
        } 
        else if (key < arr[mid]) {
            end = mid - 1;
        } 
        else {
            start = mid + 1;
        }
    }
    return result;
}

    
}
