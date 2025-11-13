import java.util.HashMap;

public class LongestSubarray {

    static int SubArray(int[] arr, int n, int k) {
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

    
}
