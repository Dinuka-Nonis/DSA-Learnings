// Binary search repeatedly divides a sorted list in half to quickly find a value.

public class BS_Explained {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;     // target found
            }
            else if (arr[mid] < target) {
                left = mid + 1; // move to right half
            }
            else {
                right = mid - 1; // move to left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 3;

        int ind = binarySearch(arr, target);

        if (ind != -1) {
            System.out.println("Target found at index: " + ind);
        } else {
            System.out.println("Target not found");
        }
    }
}
