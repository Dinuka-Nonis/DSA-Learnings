public class Largest {
    public static void main(String[] args) {

        int arr[] = {12,54,38,10,60,29,10}    ;
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i<n ; i++){
            

            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.println("Maximum until now :"+ max);
        }
        System.out.println("Largest number in the array:"+ max );
    }
}
