public class RotatedSorted {

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

public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums1, 0)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums2, 3)); // Output: -1
    }
}
