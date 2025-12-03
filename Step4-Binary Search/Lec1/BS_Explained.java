// Binary search repeatedly divides a sorted list in half to quickly find a value.

public class BS_Explained {

    // Iterative Binary Search
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

    // Recursive Binary Search
    public static int RecursiveBS(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return RecursiveBS(arr, left, mid - 1, target);
        }

        return RecursiveBS(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 3;

        int ind = binarySearch(arr, target);
        int RecIndex = RecursiveBS(arr, 0, arr.length - 1, target);

        // Iterative result
        if (ind != -1) {
            System.out.println("Iterative: Target found at index: " + ind);
        } else {
            System.out.println("Iterative: Target not found");
        }

        // Recursive result
        if (RecIndex != -1) {
            System.out.println("Recursive: Target found at index: " + RecIndex);
        } else {
            System.out.println("Recursive: Target not found");
        }
    }
}
