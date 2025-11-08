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

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int num= 30;

        int result = LinearSearch(arr, n, num);
        if(result !=-1)
        System.out.println("Element found at index "+result);
        else
            System.out.println("Element not found.");
    }
}
