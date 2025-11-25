/*
Problem:
Given an array with an equal number of positive and negative integers, 
we must rearrange it so that elements appear alternately as:
positive, negative, positive, negative, ...
while keeping the original order of positive numbers and negative numbers unchanged.

Approach:
1. Traverse the array once and store:
      - all positive numbers in a 'pos' array,
      - all negative numbers in a 'neg' array.
2. Since the array starts with a positive number, place:
      - positives at even indices  (0, 2, 4, ...)
      - negatives at odd indices  (1, 3, 5, ...)
3. Fill the original array by taking elements from 'pos' and 'neg'
   in their existing order to maintain relative ordering.
*/

public class RearrangingPosNeg {
    public int[] rearrangeBySign(int[] A) {
        int n = A.length;

        // Result array initialized to size n
        int[] ans = new int[n];

        // posIndex for even indices (positive), negIndex for odd (negative)
        int posIndex = 0, negIndex = 1;

        // Traverse input array
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                // Place negative number at odd index
                ans[negIndex] = A[i];
                negIndex += 2;
            } else {
                // Place positive number at even index
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};

        RearrangingPosNeg obj = new RearrangingPosNeg();
        int[] result = obj.rearrangeBySign(A);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
