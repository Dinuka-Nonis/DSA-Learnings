public class Sort012 {
    static int[] Sort(int[] arr , int n ){
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <=high) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp ;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,2,2,1,0};
        int n = arr. length;

        int[] result = Sort(arr, n);
        System.out.println("Sorted Array:");
        for(int num : result){System.out.print(num + " ");}
    }
}
