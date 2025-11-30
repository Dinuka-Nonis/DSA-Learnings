import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums.length==0){
            return ans;
        }

        int max = nums[nums.length-1];
        ans.add(nums[nums.length-1]);

        for (int i = nums.length-2 ; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {
        Leaders obj = new Leaders();

        int[] arr = {4, 7, 1, 0}; // sample input

        ArrayList<Integer> result = obj.leaders(arr);

        System.out.println("Leaders in the array:");
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
    Problem:
    ----------
    A "leader" in an array is an element that is greater than all the elements
    to its right. The last element is always a leader because nothing comes after it.

    Example:
    For arr = [4, 7, 1, 0]
    Leaders are: 7, 1, 0

    Why?
    - 0 is a leader (no elements on the right)
    - 1 > 0  → leader
    - 7 > 1 and 0 → leader
    - 4 < 7 → NOT a leader

    Approach:
    ----------
    1. Start from the rightmost element because it is always a leader.
    2. Keep a variable 'max' that stores the largest value seen so far from the right.
    3. Move leftwards through the array.
    4. If the current element is greater than 'max', it is a leader.
       - Add it to the answer list
       - Update 'max'
    5. Since leaders are found from right to left, reverse the final list to restore order.

    Time Complexity: O(n) — only one scan of the array.
*/
