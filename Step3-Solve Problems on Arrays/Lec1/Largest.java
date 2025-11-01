/*
 * Program: Find the Largest Element in an Array
 * ---------------------------------------------
 * This program scans through the array and keeps track of the maximum value found so far.
 * For each element, it compares it with the current maximum and updates 'max' if a larger
 * value is found.
 *
 * Example:
 * arr = [12, 54, 38, 10, 60, 29, 10]
 * Step-by-step max updates:
 * 12 → 54 → 54 → 54 → 60 → 60 → 60
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Largest {
    public static void main(String[] args) {

        int arr[] = {12,54,38,10,60,29,10}    ;
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i<n ; i++){
            System.out.println("Checking element: " + arr[i]);


            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.println("Maximum until now :"+ max);
        }
        System.out.println("Largest number in the array:"+ max );
    }
}
