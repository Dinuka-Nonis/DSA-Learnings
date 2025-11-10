public class MissingNum {
    static int FindMissing(int[] arr , int n ){
        int expectedsum = (n*(n+1))/2;

        int actualSum = 0;
        for(int i = 0 ; i<n-1;i++){
            actualSum = actualSum+ arr[i];
        }
        int missing = expectedsum - actualSum;
        return missing;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 5;

        System.out.println("Missing value: "+ FindMissing(arr, n));
    }
}
