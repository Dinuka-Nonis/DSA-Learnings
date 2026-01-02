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
