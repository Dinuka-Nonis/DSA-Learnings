public class NumberThatAppersOnce {

    static int XORfunc(int[] arr, int n){
        int ans = 0 ; 
        for(int i = 0; i<n ; i++){
            ans = ans^arr[i]; //  XOR calculation - ^
        }
        return ans ; // returning the final value
    }
    
}
