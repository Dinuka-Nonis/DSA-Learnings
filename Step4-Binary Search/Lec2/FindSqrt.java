
public class FindSqrt {
    public int floorsqrt(int n) {
        if (n==0 || n ==1)
            return n;

        int low =1, high = n;
        int ans = 0;

        while ( low<= high){
            int mid = low + (high - low)/2;

            if((long) mid* mid == n ){
                return mid;
            }
            else if ((long) mid * mid < n ){
                ans = mid;
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return ans;
    }
}
