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
