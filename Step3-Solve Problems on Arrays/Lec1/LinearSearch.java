public class LinearSearch {
    static int LinearSearch(int[] arr, int n, int num){
        for(int i=0; i<n ; i++){
            if(arr[i]==num){
                System.out.println(num +"is present at index "+i);
                return i;
            }
        }
        System.out.println(num + "is not present in the array.");
        return -1;

    }
}
