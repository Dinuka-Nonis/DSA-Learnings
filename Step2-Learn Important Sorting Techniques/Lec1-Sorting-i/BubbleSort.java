public class BubbleSort {
    public static void main(String[] args)     {
        int arr[] = {12,34,75,32,92,19};
        int n = arr.length;

        for( int i = n-1 ; i>=0; i--){
            for (int j = 0 ; j < i;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After bubble sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/* 
         * Bubble Sort Algorithm:
         * ----------------------
         * In each pass, we compare adjacent elements (arr[j] and arr[j+1]).
         * If they are in the wrong order (arr[j] > arr[j+1]), we swap them.
         * 
         * After each outer loop pass:
         * - The largest unsorted element "bubbles up" to the end of the array.
         * - Therefore, after the 1st pass, the last element is in its correct position.
         * - After the 2nd pass, the second last element is in place, and so on.
         */