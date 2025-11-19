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
}