public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {28,45,65,13,64};
        int n = arr.length;

        for (int i = 0; i<=n-1 ; i++) {
            int j = i;
            while(j > 0 &&arr[j-1] >arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }

        System.out.println("After insertion sort : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
}


/*
 * Insertion Sort Algorithm (using swapping):
 * ------------------------------------------
 * This algorithm builds the sorted part of the array one element at a time.
 * Starting from the second element, it repeatedly compares the current element
 * with the previous elements and swaps them leftward until it reaches the correct position.
 *
 * Think of it like sorting playing cards in your hand:
 * each new card (element) is inserted into its proper place among the already sorted cards.
 *
 * After each outer loop iteration, the left part of the array (from index 0 to i)
 * becomes sorted.
 *
 * Time Complexity:
 * - Best Case (already sorted): O(n)
 * - Worst/Average Case: O(n²)
 * - Space Complexity: O(1) (in-place sorting)
 */
