public class NumberThatAppersOnce {

    // Approach Explanation:
// We use the XOR (^) operator to find the number that appears only once.
// XOR has two key properties:
// 1. a ^ a = 0  → XOR of the same numbers is 0.
// 2. a ^ 0 = a  → XOR of any number with 0 gives the number itself.
// Since all numbers except one appear twice, their XOR becomes 0.
// Finally, XORing all elements together leaves only the single unique number.

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
