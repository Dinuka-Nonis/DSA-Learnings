
import java.util.HashMap;

public class Majority {
    static int majority(int[] arr , int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            int current = arr[i];

            map.put(current, map.getOrDefault(current, 0)+1);

            if(map.get(current) > n/2){
                return current;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n = arr.length;
        System.out.println(majority(arr, n));
    }
}
