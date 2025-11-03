/*
    Problem Statement:
    ------------------
    Write a Java program to find the second smallest and second largest 
    distinct elements in an integer array.

    Explanation:
    -------------
    - The program uses two separate functions:
        1. secondsmallest() → Finds the second smallest distinct element.
        2. secondlargest()  → Finds the second largest distinct element.

    - Both functions use a single traversal (O(N) time complexity) with 
      two variables each:
        → For smallest:  'small' and 'secondsmallest'
        → For largest:   'large' and 'secondlargest'

    - Algorithm logic:
        • For second smallest:
            - If current element < small → update secondsmallest = small; small = element
            - Else if element is smaller than secondsmallest and not equal to small → update secondsmallest
        • For second largest:
            - If current element > large → update secondlargest = large; large = element
            - Else if element is larger than secondlargest and not equal to large → update secondlargest

    - The program prints "No distinct second ..." messages if all elements
      are equal or if the array has fewer than 2 elements.
      */

      
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,19,47,26,91,19,21};
        int n = arr.length;
        
        int secondSmall = secondsmallest(arr, n);

        if (secondSmall == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest element found.");
        } else {
            System.out.println("Second smallest element is: " + secondSmall);
        }
         int secondLarge = secondlargest(arr, n);

        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secondLarge);
        }

        
    }
    static int secondsmallest(int[] arr, int n){
        if(n<2) {
            System.out.println("Array need at least two elements to find second smallest");
            return Integer.MAX_VALUE ;
        }

        int small = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i = 0 ; i<n;i++){
            if(arr[i]<small){
                secondsmallest = small;
                small = arr[i];
            }else if (arr[i] < secondsmallest && arr[i] != small){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }

    static int secondlargest(int[] arr , int n){
        if(n<2) {
            System.out.println("Array need at least two elements to find second smallest");
            return Integer.MIN_VALUE ;
        }

        int large = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0 ; i<n;i++){
            if(arr[i]>large){
                secondlargest = large;
                large = arr[i];
            }else if (arr[i] > secondlargest && arr[i] != large){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    
}
