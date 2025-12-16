
import java.util.Scanner;
 /*
     * PROBLEM:
     * Given a sorted array of distinct integers and a target value x,
     * find the index of x if it exists.
     * If x does not exist, return the index where it should be inserted
     * so that the array remains sorted.
     */

    /*
     * APPROACH:
     * Since the array is sorted, we use Binary Search.
     * - If the target is found, return its index.
     * - If not found, the position where binary search stops (low)
     *   gives the correct insertion index.
     * This approach runs in O(log n) time.
     */
public class InsertPosition {
    public static int searchInsert(int[]arr, int x) {
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low + (high -low)/2;

            if(arr[mid] ==x)
                return mid;
            else if (arr[mid] < x)
                low = mid  +1;
            else
                high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value to search: ");
        int x = sc.nextInt();

        int result = searchInsert(arr, x);
        System.out.println("Result index: " + result);

        sc.close();
    }
}
