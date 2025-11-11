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
    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,0,1,1,0};
        int n = arr.length;
        System.out.println("Maximum consecutive one's : "+ ConsecOnes(arr, n));
    }
}
