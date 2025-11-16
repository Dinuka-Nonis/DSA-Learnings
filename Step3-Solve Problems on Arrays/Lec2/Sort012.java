public class Sort012 {
    static int[] Sort(int[] arr , int n ){
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <=high) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp ;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,2,2,1,0};
        int n = arr. length;

        int[] result = Sort(arr, n);
        System.out.println("Sorted Array:");
        for(int num : result){System.out.print(num + " ");}
    }
}

/*
    Problem:
    --------
    Given an array containing only the values 0, 1, and 2,
    we need to sort the array in a single pass (O(n)) and 
    without using extra space. This is a variation of the
    Dutch National Flag algorithm.

    Idea of the Algorithm:
    ----------------------
    We divide the array into 4 logical sections using three pointers:

        arr[0 … low-1]      -> all 0s
        arr[low … mid-1]    -> all 1s
        arr[mid … high]     -> unknown / unsorted region
        arr[high+1 … n-1]   -> all 2s

    We only examine arr[mid] and fix its position.

    Pointer Roles:
    --------------
    low  : boundary of the 0s region
    mid  : current element to be checked
    high : boundary of the 2s region

    Approach:
    ---------
    We run a loop while mid <= high and check arr[mid]:

    1. If arr[mid] == 0:
           - Swap arr[low] and arr[mid]
           - Move both low++ and mid++
           -> Because 0 belongs to the left section

    2. If arr[mid] == 1:
           - mid++
           -> Because 1 is already in the correct middle section

    3. If arr[mid] == 2:
           - Swap arr[mid] and arr[high]
           - Decrement high--
           -> Because 2 belongs to the right section
           IMPORTANT: Do NOT move mid here, because the element
                      swapped from 'high' may still be 0/1/2.

    The loop ends when mid crosses high, meaning the entire
    array is now correctly partitioned into 0s, 1s, and 2s.

    Time Complexity : O(n)
    Space Complexity: O(1)
*/
