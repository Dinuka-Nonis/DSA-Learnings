import java.util.HashMap;

public class TwoSum {
    static boolean doesTwoSumExist(int[] arr, int n, int k) {
        HashMap <Integer , Integer > map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            int current = arr[i];
            int needed = k-current;

        if (map.containsKey(needed)){
            return true; // pair found
        }
        map.put(current, i);
    }
    return false;
    }
}
