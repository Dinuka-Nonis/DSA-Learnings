/*
 * This program moves all zeros in an integer array to the end while maintaining 
 * the relative order of non-zero elements. 
 * 
 * It uses an optimized two-pointer approach:
 *  - First, pointer 'j' is set to the index of the first zero found in the array.
 *  - Then, pointer 'i' scans the rest of the array starting from j + 1.
 *  - Whenever a non-zero element is found at arr[i], it is swapped with arr[j],
 *    and 'j' is incremented to point to the next zero position.
 * 
 * This ensures that all non-zero elements are shifted toward the beginning 
 * of the array, while all zeros accumulate at the end.
 * 
 * Time Complexity: O(n)  — each element is visited once.
 * Space Complexity: O(1) — the operation is done in-place without using extra memory.
 */

 
public class ZeroToEnd {
    static void moveZeros(int[] arr , int n ){
        int j = -1;
        for(int i=0 ; i<n ; i++){
            
            if(arr[i]==0){
                j=i;
                break;
            }
        }
            if( j == -1) return; // no zero found 

            for (int i=j+1 ; i<n ;i++){
                if(arr[i] !=0){ // if the current element is Zero
                    int temp = arr[i]; // swap it with arr[j]
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }     
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,2,54,2,0};
        int arr2[] = {0,1,0,0,2,54,2,0};
        int n = arr.length;
        int a = arr2.length;
        moveZeros(arr, n);
        for (int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
System.out.println("Array : 0,1,0,0,2,54,2,0");
        moveZeros(arr2, a);
        for (int i = 0 ; i<n ; i++){
            System.out.print(arr2[i] + " ");
            System.out.println();
        }
    }
}
