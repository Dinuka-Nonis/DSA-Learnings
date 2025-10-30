public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {23,56,67,16,8};
        int n = arr.length;

        for(int i=0 ; i<n-1 ;i++){
            //assuming first element is smallest
            int minIndex = i;

            for(int j = i+1 ; j<n ; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("sorted array: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }   
}
