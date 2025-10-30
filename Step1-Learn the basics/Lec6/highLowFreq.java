
import java.util.HashMap;
import java.util.Map;

public class highLowFreq {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5}; // initializing array
        int n = arr.length;
        highLow (arr,n);
    }   
    static void highLow(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>(); // create a new hashmap map<key , value>

        //Take the current count of arr[i] from the map (or 0 if it doesn’t exist), add 1 to it, and store it back
        for(int i = 0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > maxFreq) {
                maxFreq=value;
                maxElement=key;
            }
            if(value < minFreq){
                minFreq=value;
                minElement=key;
            }
        }
        System.out.println(maxElement + " " + minElement);
    }
}
