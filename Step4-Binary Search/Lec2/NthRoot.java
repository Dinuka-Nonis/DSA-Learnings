/*
 Problem:
 Given two numbers n and m, find an integer x such that x^n = m.
 If no such integer exists, return -1.

 Approach:
 We use Binary Search because as x increases, x^n also increases.
 The possible value of x lies between 1 and m.

 Steps:
 1. Set low = 1 and high = m.
 2. Find mid and calculate mid^n using a loop (avoid Math.pow).
 3. If mid^n == m, return mid.
 4. If mid^n < m, search in the right half.
 5. If mid^n > m, search in the left half.
 6. If no value satisfies the condition, return -1.
*/

public class NthRoot {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;

        while ( low <= high ){
            int mid = (low + high)/2 ;

            long ans = 1;
            for ( int i = 0; i<n ; i++) {
                ans *= mid ;
                if ( ans > m) break;
            }
            if (ans == m) return mid;
            if (ans< m) low = mid + 1;
            else high = mid -1;

        }
        return -1;
    }
    public static void main(String[] args) {
        NthRoot obj =new NthRoot();
        int result = obj.nthRoot(3, 27);
        System.out.println(result);

    }
}
