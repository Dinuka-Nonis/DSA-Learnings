class Solution {
    // Function to find a peak element using binary search
    public int findPeakElement(int[] nums) {
        // Set left and right bounds
        int low = 0, high = nums.length - 1;

        // Binary search loop
        while (low < high) {
            // Find mid point
            int mid = (low + high) / 2;

            // If mid element is greater than next
            if (nums[mid] > nums[mid + 1]) {
                // Move to left half
                high = mid;
            } else {
                // Move to right half
                low = mid + 1;
            }
        }

        // Return peak index
        return low;
    }

    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        // Create object
        Solution obj = new Solution();

        // Output result
        System.out.println(obj.findPeakElement(nums));
    }
}
