/*
Two Sum Problem:

Problem:
Given an array of integers 'arr' and a target integer 'k', 
we need to determine whether there exists a pair of numbers in the array 
whose sum equals the target. Additionally, we want to return the indices 
of that pair if it exists, or {-1, -1} if it does not.

Constraints:
- You cannot use the same element twice (i.e., arr[i] + arr[i] is not allowed unless it appears twice in the array).
- The solution should be efficient (better than O(n^2) brute force).

Approach (Using HashMap):

1. Use a HashMap to store numbers we have already seen in the array as keys,
   and their corresponding indices as values.

2. Traverse the array:
   a. For each element arr[i], calculate the number needed to reach the target:
        needed = k - arr[i]
   b. Check if 'needed' already exists in the HashMap:
        - If yes, we have found a pair whose sum equals the target.
          Return the indices of 'needed' and 'current element'.
        - If no, store the current element and its index in the HashMap for future checks.

3. If the loop ends without finding any pair, return {-1, -1}.

Time Complexity: O(n)   // because each element is processed once
Space Complexity: O(n)  // for storing elements in the HashMap

This approach ensures that we check for a matching pair efficiently in a single pass
without using nested loops.
*/

import java.util.HashMap;

public class TwoSum {
    static int[] doesTwoSumExist(int[] arr, int n, int k) {
        HashMap <Integer , Integer > map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            int current = arr[i];
            int needed = k-current;

        if (map.containsKey(needed)){
            return new int[] {map.get(needed), i};
        }
        map.put(current, i);
        }
      return new int[] { -1, -1 }; // No pair found
    }
    public static void main(String[] args) {
        int[] arr= {2,6,5,8,11};
        int target = 8 ;

        int[] indices = doesTwoSumExist(arr, arr.length, target);
        if(indices[0] != -1){
            System.out.println("YES, pair exists!");
            System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
            System.out.println("Values: [" + arr[indices[0]] + ", " + arr[indices[1]] + "]");
    } else {
        System.out.println("NO, no pair exists.");        }

    }
}
