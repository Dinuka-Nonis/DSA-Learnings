public class FloorAndCeiling {
    /*
     * PROBLEM:
     * Given a sorted array arr[] and a value x,
     * find:
     * - Floor of x: largest element <= x
     * - Ceiling of x: smallest element >= x
     */

    /*
     * APPROACH:
     * Since the array is sorted, we use Binary Search.
     * - If arr[mid] == x → both floor and ceiling are x
     * - If arr[mid] < x → possible floor, search right
     * - If arr[mid] > x → possible ceiling, search left
     * Time Complexity: O(log n)
     */
    
}
