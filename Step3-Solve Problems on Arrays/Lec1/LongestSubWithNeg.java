
import java.util.HashMap;

public class LongestSubWithNeg {

    static int subarrayWithNegative(int[] arr , int n , int k){
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int prefix =0 ;
        int maxLen = 0 ;

        for(int i =0 ; i<n ;i++){
            prefix += arr[i];

            if(prefix == k){
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = prefix -k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(prefix)) {
                preSumMap.put(prefix, i);
            }

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int n = a.length;
        int len = subarrayWithNegative(a, n, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    
}
