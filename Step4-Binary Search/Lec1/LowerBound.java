public class LowerBound {
    public static int lowerBound(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high ){
            int mid = low + (high -low)/2;

            if (arr[mid] >= x) {
                ans = mid;      // possible answer
                high = mid - 1; // search in left half
            } else {
                low = mid + 1;  // search in right half
            }
        }

        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;

        int result = lowerBound(arr, x);
        System.out.println("Lower Bound of " + x + " is index: " + result);
    }
}
