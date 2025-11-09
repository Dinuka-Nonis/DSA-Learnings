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
        while(j<n){
            if(Union.get(Union.size()-1) != arr2[j])
            Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
