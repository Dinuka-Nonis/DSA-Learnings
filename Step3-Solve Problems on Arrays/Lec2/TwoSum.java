import java.util.HashMap;

public class TwoSum {
    static int[] doesTwoSumExist(int[] arr, int n, int k) {
        HashMap <Integer , Integer > map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            int current = arr[i];
            int needed = k-current;

        if (map.containsKey(needed)){
            return new int[] {map.get(needed), i};
        }
        map.put(current, i);
        }
      return new int[] { -1, -1 }; // No pair found
    }
}
