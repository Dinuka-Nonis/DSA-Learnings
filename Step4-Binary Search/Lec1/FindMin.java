class FindMin {

    // Function to find the minimum element in a rotated sorted array
    public int findMin(int[] nums) {

        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int low = 0, high = nums.length - 1;

        // Binary search loop
        while (low < high) {

            int mid = low + (high - low) / 2;

            // Decide which half contains the minimum
            if (nums[mid] > nums[high]) {
                low = mid + 1;   // Minimum is in right half
            } else {
                high = mid;      // Minimum is in left half (including mid)
            }
        }

        // low == high → index of minimum element
        return nums[low];
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        FindMin sol = new FindMin();
        int result = sol.findMin(nums);

        System.out.println("Minimum element is " + result);
    }
}
