// Program to find the union of two sorted arrays (arr1 and arr2) without duplicates by merging them in sorted order using two pointers.
// It uses two pointers (i for arr1, j for arr2) to compare elements one by one:
// 1. Add the smaller element to the Union list (if it's not a duplicate).
// 2. If both elements are equal, add it once and move both pointers forward.
// 3. After one array ends, add the remaining elements of the other array (avoiding duplicates).
// Finally, return the Union list containing all unique elements in sorted order.
import java.util.ArrayList;

public class UnionOfSorted {
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2,int n ,int m){
        int i=0 , j=0;
  ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){ // if the current element of arr1 is smaller or equal to arr2 element. means arr1 shoul come first in order
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]) // if the list is empty we can add element safely
                // get the last element of the list Union.size()-1 --- and checks whether current eement is differ than last element
                Union.add(arr1[i]);
                i++;
            }else{
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
                j++;
            }
        }
        while (i<n){ // if there are any left in arr1
            if(Union.get(Union.size()-1)!=arr1[i])
            Union.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(Union.get(Union.size()-1) != arr2[j])
            Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    public static void main(String args[]) {
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");
}
}