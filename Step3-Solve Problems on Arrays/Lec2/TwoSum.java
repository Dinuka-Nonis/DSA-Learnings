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
    public static void main(String[] args) {
        int[] arr= {2,6,5,8,11};
        int target = 8 ;

        int[] indices = doesTwoSumExist(arr, arr.length, target);
        if(indices[0] != -1){
            System.out.println("YES, pair exists!");
            System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
            System.out.println("Values: [" + arr[indices[0]] + ", " + arr[indices[1]] + "]");
    } else {
        System.out.println("NO, no pair exists.");        }

    }
}
