// Approach: We use binary search on the sorted array to efficiently find the smallest index where arr[index] > x. 
    // We initialize low = 0, high = n-1, and ans = n (default if no element > x is found). 
    // In each step, we calculate mid = (low + high) / 2. 
    // If arr[mid] > x, we update ans = mid and search the left half (high = mid - 1) to find a smaller valid index. 
    // Otherwise (arr[mid] <= x), we search the right half (low = mid + 1). 
    // After the loop ends, ans contains the first index where arr[index] > x, or n if no such element exists.
    
public class UpperBound {
    public static int UpperBound(int[] arr, int x)   {
        int n= arr.length;
        int low = 0,high = n-1;
        int ans = n;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] > x){
                ans= mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 2;

        int result = UpperBound(arr, x);
        System.out.println("Upper Bound of " + x + " is index: " + result);
    }
}
