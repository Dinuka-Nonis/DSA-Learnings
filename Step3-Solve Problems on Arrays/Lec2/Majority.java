
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
        int[] arr1 = {5, 5, 5, 2, 5, 3, 5};
System.out.println(MooreVoting(arr1, arr1.length)); // Expected: 5

int[] arr2 = {1, 2, 3, 4, 5, 5, 5, 5, 5};
System.out.println(MooreVoting(arr2, arr2.length)); // Expected: 5

    }
}
