/*
 This program searches for a target element in a rotated sorted array
 that may contain duplicate values.

 Approach:
 - Uses a modified Binary Search to achieve efficient searching.
 - At each step, we calculate the middle index.
 - If the middle element matches the target, we return true.
 - If the values at low, mid, and high are equal, we cannot determine
   which half is sorted, so we safely shrink the search space by
   incrementing low and decrementing high.
 - Otherwise, we check which half of the array is sorted:
     • If the left half is sorted, we check whether the target lies in it.
     • If the right half is sorted, we check whether the target lies in it.
 - Based on this check, we discard the unnecessary half and continue searching.

 The loop continues until the target is found or the search space becomes empty.
 If the target is not found, the function returns false.

*/

public class RotatedSort2 {
    public boolean searchInRotatedSortedArrayII(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If mid element is the target
            if (arr[mid] == k) return true;

            // Handle duplicates: cannot determine sorted side
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;  // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }

        return false; // Not found
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;

        RotatedSort2 obj = new RotatedSort2();
        boolean ans = obj.searchInRotatedSortedArrayII(arr, k);

        if (ans)
            System.out.println("Target is present in the array.");
        else
            System.out.println("Target is not present.");
    }

    
}
