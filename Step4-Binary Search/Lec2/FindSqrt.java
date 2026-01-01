
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
    public static void main(String[] args) {
        int n = 10;   // change this value to test

        FindSqrt obj = new FindSqrt();
        int result = obj.floorsqrt(n);

        System.out.println("Floor square root of " + n + " is: " + result);
    }
}
