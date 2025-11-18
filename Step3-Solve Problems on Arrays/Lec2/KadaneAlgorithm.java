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
