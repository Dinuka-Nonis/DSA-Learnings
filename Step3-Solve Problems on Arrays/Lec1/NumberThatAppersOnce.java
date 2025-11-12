public class NumberThatAppersOnce {

    static int XORfunc(int[] arr, int n){
        int ans = 0 ; 
        for(int i = 0; i<n ; i++){
            ans = ans^arr[i]; //  XOR calculation - ^
        }
        return ans ; // returning the final value
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,1,2,4,3};
        int n = arr.length;

        System.out.println(XORfunc(arr, n));
    }
    
}
