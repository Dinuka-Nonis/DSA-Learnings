public class RotatedSorted {
    public class SearchRotatedArray {

    public static int search(int[] nums, int k) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == k) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (k >= nums[low] && k < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (k > nums[mid] && k <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
}
