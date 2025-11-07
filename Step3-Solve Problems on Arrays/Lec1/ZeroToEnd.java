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
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,2,54,2,0};
        int arr2[] = {0,1,0,0,2,54,2,0};
        int n = arr.length;
        int a = arr2.length;
        moveZeros(arr, n);
        for (int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
System.out.println("Array : 0,1,0,0,2,54,2,0");
        moveZeros(arr2, a);
        for (int i = 0 ; i<n ; i++){
            System.out.print(arr2[i] + " ");
            System.out.println();
        }
    }
}
