public class ZeroToEnd {
    static void moveZeros(int[] arr , int n ){
        int j = -1;
        for(int i=0 ; i<n ; i++){
            
            if(arr[i]==0){
                j=i;
                break;
            }
        }
            if( j == -1) return; // no zero found 

            for (int i=j+1 ; i<n ;i++){
                if(arr[i] !=0){ // if the current element is Zero
                    int temp = arr[i]; // swap it with arr[j]
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }     
        }
    
    }
}
