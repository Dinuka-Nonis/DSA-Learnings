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