// The method checks if the array is sorted in ascending order.
// It starts from the second element (index 1) and compares each
// element with its previous one. If any element is smaller than
// the previous, the array is not sorted.


public class SortedCheck {

    static boolean isSorted(int arr[], int n){
        if(n <=1){
            return true;
        } else {
            for(int i=1 ; i<n; i++){
                if(arr[i] < arr[i-1])
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {1,3,2,4,5,6,};
        int n = arr.length;
        int n2 = arr2.length;

        System.out.println(isSorted(arr, n));
        System.out.println(isSorted(arr2, n));
    }
}
