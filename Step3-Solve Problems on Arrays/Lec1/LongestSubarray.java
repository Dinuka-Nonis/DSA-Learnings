/*
Approach: Longest Subarray with Sum = k (Using Prefix Sum + HashMap)

1. Intuition:
   - We want the length of the longest continuous subarray whose elements sum to 'k'.
   - A subarray sum from index i to j can be calculated using prefix sums:
       sum(i...j) = prefixSum[j] - prefixSum[i-1]
   - If prefixSum[j] - k exists as a previous prefix sum, it means the subarray 
     between that previous index + 1 and j sums to k.

2. Steps:
   a) Initialize a HashMap to store prefixSum -> first occurrence index.
   b) Initialize prefixSum = 0 and maxLen = 0.
   c) Iterate through the array:
      - Add current element to prefixSum.
      - Case 1: If prefixSum == k, update maxLen = i + 1 (subarray from start).
      - Case 2: If (prefixSum - k) exists in the map, calculate the subarray 
        length i - map.get(prefixSum - k) and update maxLen if it is larger.
      - Case 3: If prefixSum is not in the map, add it with current index (store 
        first occurrence to maximize subarray length later).
   d) Return maxLen.
   */
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

        int[] arr2 = {2, 3, 5, 1, 9};
        int k2 = 10;
        System.out.println("Longest subarray length (Example 2) = " + longestSubarray(arr2, arr2.length, k2));

        int[] arr3 = {1, 2, 3, 7, 5};
        int k3 = 12;
        System.out.println("Longest subarray length (Example 3) = " + longestSubarray(arr3, arr3.length, k3));
    }
    
}
