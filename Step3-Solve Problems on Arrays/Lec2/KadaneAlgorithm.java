public class KadaneAlgorithm {

    static void kadane(int[] arr, int n) {
        int maxSum = arr[0];
        int currentSum = 0;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            // Update maxSum and best subarray indexes
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            // If currentSum becomes negative, restart from next index
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.print("Subarray = [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;

        kadane(arr, n);
    }
}
/* 
   Problem:
   Given an integer array, find the contiguous subarray with the maximum sum 
   and also print that subarray.

   Approach (Kadane’s Algorithm):
   - Traverse the array while maintaining:
        currentSum → sum of current subarray
        maxSum → best subarray sum found so far
   - Add each element to currentSum.
   - If currentSum exceeds maxSum → update maxSum and store subarray indexes.
   - If currentSum becomes negative → reset it to 0 and start a new subarray.
   - This works because a negative running sum cannot help in forming a max-sum subarray.
   - Time Complexity: O(n), Space: O(1)
*/
