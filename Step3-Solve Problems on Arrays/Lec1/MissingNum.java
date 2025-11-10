/*
Problem:
Given an integer N and an array of size N-1 containing numbers from 1 to N with exactly one number missing,
find the missing number.

Approach:
1. Calculate the sum of all numbers from 1 to N using the formula: sum = N*(N+1)/2
2. Calculate the sum of all elements present in the given array.
3. The missing number is the difference between the expected sum and the actual sum.
   missing = expectedSum - actualSum

This approach works because only one number is missing, so the difference directly gives that number.
*/

public class MissingNum {
    static int FindMissing(int[] arr , int n ){
        int expectedsum = (n*(n+1))/2;

        int actualSum = 0;
        for(int i = 0 ; i<n-1;i++){
            actualSum = actualSum+ arr[i];
        }
        int missing = expectedsum - actualSum;
        return missing;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 5;

        System.out.println("Missing value: "+ FindMissing(arr, n));
    }
}
