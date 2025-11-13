import java.util.HashMap;

public class LongestSubarray {

    static int longestSubarray(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Case 1: Subarray starts from index 0
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: Check if there exists a prefixSum - k
            if (map.containsKey(prefixSum - k)) {
                int len = i - map.get(prefixSum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: Store prefixSum if not seen before
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
public static void main(String[] args) {
        int[] arr1 = {2, 3, 5};
        int k1 = 5;
        System.out.println("Longest subarray length (Example 1) = " + longestSubarray(arr1, arr1.length, k1));
        // Expected output: 2

        int[] arr2 = {2, 3, 5, 1, 9};
        int k2 = 10;
        System.out.println("Longest subarray length (Example 2) = " + longestSubarray(arr2, arr2.length, k2));
        // Expected output: 3

        int[] arr3 = {1, 2, 3, 7, 5};
        int k3 = 12;
        System.out.println("Longest subarray length (Example 3) = " + longestSubarray(arr3, arr3.length, k3));
        // Expected output: 3 ([2,3,7])
    }
    
}
