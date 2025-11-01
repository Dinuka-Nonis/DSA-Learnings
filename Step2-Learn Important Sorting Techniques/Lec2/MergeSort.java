/*
 * Merge Sort Algorithm:
 * ---------------------
 * Uses the Divide and Conquer approach.
 * 1. Divide the array into two halves recursively until only one element remains.
 * 2. Merge the sorted halves by comparing elements and placing them in order.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)  (extra space for temporary arrays)
 *
 * Example flow:
 * [6, 3, 9, 5] → split → [6, 3] [9, 5]
 * → merge each → [3, 6] [5, 9]
 * → final merge → [3, 5, 6, 9]
 */

public class MergeSort {
    static void MergeSort(int[] arr, int low, int high ){
        if(low>=high) return;

        int mid = (low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    static void merge (int[] arr, int low, int mid, int high){
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];

        for(int i =0; i< left.length;i++)
        left[i] = arr[low+i];

        for(int j =0 ; j<right.length;j++){
            right[j] = arr[mid+1+j];
        }

        int i =0, j=0,k=low;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++]=right[j++];
            }
        }
        while(i<left.length) arr[k++] = left[i++];
        while(j<right.length) arr[k++] = right[j++];

    }

    public static void main(String[] args) {
        int arr[] = {2,54,76,23,52,23,83};
        int n = arr.length;

        MergeSort(arr, 0, n-1);

        System.out.println("After megre sort: ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
