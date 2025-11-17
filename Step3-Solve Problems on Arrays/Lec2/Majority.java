
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
    static int MooreVoting(int[] arr , int n){
        int count = 0 ;
        int element = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
            element = arr[i];}
            if(arr[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;

    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,1,1,1};
        int n = arr.length;
        System.out.println(majority(arr, n));

        System.out.println(MooreVoting(arr, n));
    }
}
