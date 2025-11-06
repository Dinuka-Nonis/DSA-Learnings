    // This program rotates the elements of an integer array by 'k' positions either to the left or right.
    // If 'side' is "right", elements are shifted towards the end, and the last elements wrap around to the front.
    // If 'side' is "left", elements are shifted towards the start, and the first elements wrap around to the end.
    // The rotation is done one step at a time, repeated 'k' times.
    
public class RotateByK {
    static void rotate(int[] arr, int k, String side, int n) {
        if (side.equals("right")) {
            for (int r = 0; r <= k; r++) {
                int temp = arr[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
        } else if (side.equals("left")) {
            for (int r = 0; r <= k; r++) {
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        rotate(arr, k, "right", n);

        System.out.println("After rotating elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
