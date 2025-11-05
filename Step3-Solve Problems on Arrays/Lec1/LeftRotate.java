/*
 * This program performs a single left rotation on an array.
Each element shifts one position to the left, and the first element moves to the end.
For example:
Before rotation: [1, 2, 3, 4, 5]
After rotation: [2, 3, 4, 5, 1]
 */

public class LeftRotate {
    static void rotate (int arr[] , int n){
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr , n);
    }
    
}
