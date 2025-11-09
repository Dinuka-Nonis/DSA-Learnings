import java.util.ArrayList;

public class UnionOfSorted {
static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i=0 , j=0;
  ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }else if (arr2[j]<arr1[i]){
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }
}
