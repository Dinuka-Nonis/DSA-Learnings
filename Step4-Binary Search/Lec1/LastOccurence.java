public class LastOccurence {

    public static int lastOccurrenceBinarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                result = mid;
                start = mid + 1;   // continue searching on the right side
            } 
            else if (key < arr[mid]) {
                end = mid - 1;    // key might be on left
            } 
            else {
                start = mid + 1;  // key might be on right
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 7};
        int key = 4;

        int index = lastOccurrenceBinarySearch(arr, key);

        if (index != -1)
            System.out.println("Last occurrence of " + key + " is at index: " + index);
        else
            System.out.println("Element not found");
    }
}

