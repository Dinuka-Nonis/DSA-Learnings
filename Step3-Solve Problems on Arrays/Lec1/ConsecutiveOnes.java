// Problem: Given a binary array (containing only 0s and 1s), find the length of the
// longest sequence of consecutive 1s present in the array.
//
// Approach: Traverse the array while keeping track of the current streak of 1s (currentCount).
// Whenever a 0 is encountered, reset currentCount to 0. Keep updating maxCount
// to store the maximum streak of consecutive 1s found so far.
// This approach runs in O(n) time and O(1) extra space.

public class ConsecutiveOnes {
    static int ConsecOnes(int[] arr, int n) {
        int maxCount = 0 ;
        int currentCount = 0; 

        for(int i = 0 ; i<n ;i++){
            if(arr[i] == 1){
                currentCount++;
            } else
            currentCount = 0;

            if(maxCount < currentCount){
                maxCount=currentCount;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,0,1,1,0};
        int n = arr.length;
        System.out.println("Maximum consecutive one's : "+ ConsecOnes(arr, n));
    }
}
