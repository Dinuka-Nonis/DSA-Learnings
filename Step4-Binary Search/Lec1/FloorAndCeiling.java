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

    public static void findFloorCeil(int[] arr, int x){
        int low = 0, high = arr.length -1;
        int floor = -1, ceil = -1;

        while(low<= high) {
            int mid = low + (high -low)/2;

            if (arr[mid] ==x){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            else if (arr[mid] <x){
                floor = arr[mid];
                low = mid+1;
            }
            else {
                ceil= arr[mid];
                high = mid-1;
            }
        }
        System.out.println(floor+ " " + ceil);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;

        findFloorCeil(arr, x);
    }
}
