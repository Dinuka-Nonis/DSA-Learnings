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
    
}
