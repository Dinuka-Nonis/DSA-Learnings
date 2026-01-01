// Problem: Given a positive integer n, find the floor value of its square root (largest integer x such that x*x ≤ n) using binary search by checking mid*mid and narrowing the search space.

//We use binary search between 1 and n to find the largest number whose square is less than or equal to n. If mid × mid is valid, we store it and move right; otherwise, we move left. The stored value is the floor of √n.

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
