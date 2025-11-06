public class RotateByK {
    static void rotate(int[] arr , int k, String side, int n) {
        if(side.equals("right")){
            
           for(int r = 0; r<k;r++){ 
            int temp = arr[n-1];
            for(int i = n ; i>0 ; i--){
                arr[i] = arr[i-1];
            }
        }
        } else {
            for(int j = 0 ; j<n ; j++) {
                int temp = j;
                arr[j] = arr[j+1];
            }
        }
            
        
    }
    
}
