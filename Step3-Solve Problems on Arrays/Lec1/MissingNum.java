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
}
