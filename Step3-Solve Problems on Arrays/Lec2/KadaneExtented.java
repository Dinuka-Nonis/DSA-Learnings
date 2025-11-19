public class KadaneExtented {
    static void kadane(int[] arr){
        int maxSum = 0;
        int sum = 0;

        int start =0, end =0,tempStart=0 ;

        for(int i =0 ; i<arr.length ; i++){
            sum +=arr[i];

            if(sum > maxSum){
                maxSum = sum;
                start = tempStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                tempStart = i+1;
            }   
        }
            System.out.println("Maximum Sum: " + maxSum);
            System.out.print("subarray: ");
            for(int j = start; j <= end ; j++){
                System.out.print(arr[j]+ " ");
    }
    }
    
    public static void main(String[] args) {

        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Test Case 1:");
        kadane(arr1);

        int[] arr2 = {1};
        System.out.println("\nTest Case 2:");
        kadane(arr2);

        int[] arr3 = {-1, -4, -5};
        System.out.println("\nTest Case 3 (all negatives):");
        kadane(arr3);
    }
}

/*
 Kadane’s Algorithm with Start and End Indices

 This method finds:
 1. The maximum subarray sum
 2. The exact subarray (start index to end index) that produces this sum

 How it works:
 - We keep a running sum called 'sum'. 
 - If 'sum' ever becomes negative, we reset it to 0 because a negative sum
   cannot help in creating a larger total later.
 - Every time we reset the sum, we store the next index as a possible starting
   point of a new subarray (tempStart).

 Tracking the subarray:
 - Whenever the running sum becomes greater than the best sum we have seen 
   (maxSum), we update maxSum and record:
        start = tempStart   // starting index of the current best subarray
        end = i             // ending index is the current position
 - This way, we always know exactly which part of the array gave the maximum sum.

 Example:
 For [-2, 1, -3, 4, -1, 2, 1],
 The algorithm identifies 4, -1, 2, 1 as the subarray with max sum = 6.

 Variables:
 - sum: running total of the current subarray
 - maxSum: best sum found so far
 - tempStart: temporary starting index (used when resetting)
 - start, end: the actual start and end indices of the best subarray

 Time Complexity: O(n), because we only scan the array once.
*/
