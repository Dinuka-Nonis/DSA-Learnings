public class ConsecutiveOnes {
    static int ConsecOnes(int[] arr, int n) {
        int maxCount = 0 ;
        int currentCount = 0; 

        for(int i = 0 ; i<n ;i++){
            if(arr[i] == 1){
                currentCount++;
            } else
            currentCount = 0;

            if(maxCount < currentCount){
                maxCount=currentCount;
            }
        }
        return maxCount;
    }
}
