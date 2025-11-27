// Problem:
// Given an array of integers, rearrange the numbers to form the next
// lexicographically greater permutation. This means we must create the
// next arrangement that would appear if all permutations were sorted.
//
// If the current arrangement is already the highest possible permutation
// (e.g., the array is in descending order), then we return the lowest
// possible arrangement by sorting the array in ascending order.
//
// Example:
// Input:  [1, 3, 2]
// Output: [2, 1, 3]   // This is the next permutation after 1 3 2
//
// Input:  [3, 2, 1]
// Output: [1, 2, 3]   // Already the largest, so return smallest


public class nextPermutation {
    public void nextPermutation(int[] nums){

        // Set index to -1
        int index = -1;

        // Find the first decreasing element from end
        for (int i = nums.length - 2; i >= 0; i--) {
            // If smaller found
            if (nums[i] < nums[i + 1]) {
                // Store index
                index = i;
                break;
            }
        }

        // If no index found
        if (index == -1) {
            // Reverse the entire array
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Find just larger element
        for (int i = nums.length - 1; i > index; i--) {
            // Swap them
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Reverse part after index
        reverse(nums, index + 1, nums.length - 1);
    }
     private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
